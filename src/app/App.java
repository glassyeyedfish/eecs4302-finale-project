package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.Map.Entry;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import coverage.ProgramCoverageData;
import html.HTML;
import pipeline.Interpreter;
import pipeline.Processor;
import pipeline.ProcessorData;
import proglang.antlr.ProgLangLexer;
import proglang.antlr.ProgLangParser;
import proglang.model.*;
import proglang.visitor.AntlrToProgram;
import testlang.antlr.TestLangLexer;
import testlang.antlr.TestLangParser;
import testlang.model.*;
import testlang.visitor.AntlrToTLProgram;

public class App {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.print("USAGE: [program file] [test file]");
			System.exit(1);
		}
		
		String programFileName = args[0];
		String testFileName = args[1];
		
		// PL Stuff
		PLProgram program;
		{
			ProgLangParser parser = getPLParser(programFileName);
			ParseTree AST = parser.prog();
			
			if (ErrorListener.hasError) {
				System.exit(1);
			}
			AntlrToProgram visitor = new AntlrToProgram();
			program = visitor.visit(AST);
			if (!visitor.getSemanticErrors().isEmpty()) {
				for (String msg: visitor.getSemanticErrors()) {
					System.err.println(msg);
				}
				System.exit(1);
			}
		}
		
//		System.out.println(
//				program.getFunctions().get("main")
//				.getStatements()
//				
//		);
		
		// TL Stuff
		TLProgram testProgram;
		{
			TestLangParser parser = getTLParser(testFileName);
			ParseTree AST = parser.prog();
			
			if (ErrorListener.hasError) {
				System.exit(1);
			}
			AntlrToTLProgram visitor = new AntlrToTLProgram();
			testProgram = visitor.visit(AST);
		}
		
//		System.out.println(
//				testProgram
//		);
		
		ProgramCoverageData coverage = new ProgramCoverageData();
		coverage.programName = program.getName();
		
		coverage.programSource = readFile(programFileName);
		coverage.testSource = readFile(testFileName);
		
		/*
		 * PROCESSOR STUFF
		 */
		Processor proc = new Processor();
		Map<String, ProcessorData> dataMap = new HashMap<>();
		
		StringJoiner formatted = new StringJoiner("\n");
		
		for (Entry<String, PLFunction> entry: program.getFunctions().entrySet()) {
			dataMap.put(entry.getKey(), proc.processPLFunction(entry.getValue()));
		}
		
		formatted.add("\n ===== RESULTS OF PROCESSOR =====");
		for (Map.Entry<String, ProcessorData> entry: dataMap.entrySet()) {
			formatted.add("\nFunction:            " + entry.getKey());
			formatted.add("All DC Paths:        " + entry.getValue().allDCPaths);
			formatted.add("All Statements:      " + entry.getValue().allStatements);
			formatted.add("All Decisions:       " + entry.getValue().allDecisions);
		}
		
		/*
		 * INTERPRETER STUFF
		 */
		
		Interpreter itrp = new Interpreter();
		for (TLTestFunc tf: testProgram.getTestFunctions()) {
			itrp.interpret(tf, program, dataMap);
		}
		
		formatted.add("\n ===== RESULTS OF INTERPRETER =====");
		for (Map.Entry<String, ProcessorData> entry: dataMap.entrySet()) {
			proc.generateAllDefs(entry.getValue());
			proc.generateAllCUses(entry.getValue());
			proc.generateAllPUses(entry.getValue());
			
			formatted.add("\nFunction:            " + entry.getKey());
			formatted.add("Covered DC Paths:    " + entry.getValue().coveredDCPaths);
			formatted.add("Covered Statements:  " + entry.getValue().coveredStatements);
			formatted.add("Covered Decisions T: " + entry.getValue().coveredDecisionsTrue);
			formatted.add("Covered Decisions F: " + entry.getValue().coveredDecisionsFalse);
			
			formatted.add("\nRequired All Defs:   " + entry.getValue().requiredForAllDefs);
			formatted.add("Covered All Defs:    " + entry.getValue().coveredForAllDefs);
			formatted.add("Required All CUses:  " + entry.getValue().requiredForAllCUses);
			formatted.add("Covered All CUses:   " + entry.getValue().coveredForAllCUses);
			formatted.add("Required All PUses:  " + entry.getValue().requiredForAllPUses);
			formatted.add("Covered All PUses:   " + entry.getValue().coveredForAllPUses);
		}
		
		System.out.println(formatted.toString());

		coverage.rawData = formatted.toString();
		coverage.dataMap = dataMap;
		
		HTML html = new HTML(coverage);
		html.outputToFile("index");
	}
	
	private static ProgLangParser getPLParser(String fileName) {
		ProgLangParser parser = null;
		
		try {
			CharStream input = CharStreams.fromFileName(fileName);			
			ProgLangLexer lexer = new ProgLangLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new ProgLangParser(tokens);
			
			parser.removeErrorListeners();
			parser.addErrorListener(new ErrorListener());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return parser;	
	}
	
	private static TestLangParser getTLParser(String fileName) {
		TestLangParser parser = null;
		
		try {
			CharStream input = CharStreams.fromFileName(fileName);			
			TestLangLexer lexer = new TestLangLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new TestLangParser(tokens);
			
			parser.removeErrorListeners();
			parser.addErrorListener(new ErrorListener());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return parser;	
	}
	
	private static String readFile(String filename) {
		try {			
			return new String(Files.readAllBytes(Paths.get(filename)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
