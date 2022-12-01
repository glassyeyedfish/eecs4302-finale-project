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
import proglang.model.expressions.*;
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
//				((PLIntegerFunctionCall) ((PLAssignment<?>) program.getFunctions().get("main")
//				.getStatements().get(0)).getExpression()).getArguments()
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
		ProcessorData data = proc.processPLProgram(program);
		
		StringJoiner formatted = new StringJoiner("\n");
		
		formatted.add("\n ===== RESULTS OF PROCESSOR =====");
		formatted.add("All DC Paths:        " + data.allDCPaths);
		formatted.add("All Statements:      " + data.allStatements);
		formatted.add("All Decisions:       " + data.allDecisions);
		
		
		
		
		/*
		 * INTERPRETER STUFF
		 */
		
		Interpreter itrp = new Interpreter();
		itrp.interpret(testProgram, program, data);
		
		formatted.add("\n ===== RESULTS OF INTERPRETER =====");
		proc.generateAllDefs(data);
		proc.generateAllCUses(data);
		proc.generateAllPUses(data);
		
		formatted.add("Covered DC Paths:    " + data.coveredDCPaths);
		formatted.add("Covered Statements:  " + data.coveredStatements);
		formatted.add("Covered Decisions T: " + data.coveredDecisionsTrue);
		formatted.add("Covered Decisions F: " + data.coveredDecisionsFalse);
		
		formatted.add("\nRequired All Defs:   " + data.requiredForAllDefs);
		formatted.add("Covered All Defs:    " + data.coveredForAllDefs);
		formatted.add("Required All CUses:  " + data.requiredForAllCUses);
		formatted.add("Covered All CUses:   " + data.coveredForAllCUses);
		formatted.add("Required All PUses:  " + data.requiredForAllPUses);
		formatted.add("Covered All PUses:   " + data.coveredForAllPUses);
		
		System.out.println(formatted.toString());
		
		System.out.println(Store.print());
		
		
		/*
		 * FRONT END STUFF
		 */

		coverage.rawData = formatted.toString();
		coverage.data = data;
		
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
