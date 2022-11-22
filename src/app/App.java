package app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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
		
		// PL Stuff
		PLProgram program;
		{
			String fileName = args[0];
			ProgLangParser parser = getPLParser(fileName);
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
			String fileName = args[1];
			TestLangParser parser = getTLParser(fileName);
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
		
		
		/*
		 * PROCESSOR STUFF
		 */
		Processor proc = new Processor();
		Map<String, ProcessorData> dataMap = new HashMap<>();
		
		for (Entry<String, PLFunction> entry: program.getFunctions().entrySet()) {
			dataMap.put(entry.getKey(), proc.processPLFunction(entry.getValue()));
		}
		
		System.out.println("\n ===== RESULTS OF PROCESSOR =====");
		for (Map.Entry<String, ProcessorData> entry: dataMap.entrySet()) {
			System.out.println("\nFunction:            " + entry.getKey());
			System.out.println("All DC Paths:        " + entry.getValue().allDCPaths);
			System.out.println("All Statements:      " + entry.getValue().allStatements);
			System.out.println("All Decisions:       " + entry.getValue().allDecisions);
		}
		
		/*
		 * INTERPRETER STUFF
		 */
		
		Interpreter itrp = new Interpreter();
		for (TLTestFunc tf: testProgram.getTestFunctions()) {
			itrp.interpret(tf, program, dataMap);
		}
		
		System.out.println("\n ===== RESULTS OF INTERPRETER =====");
		for (Map.Entry<String, ProcessorData> entry: dataMap.entrySet()) {
			proc.generateAllDefs(entry.getValue());
			proc.generateAllCUses(entry.getValue());
			proc.generateAllPUses(entry.getValue());
			
			System.out.println("\nFunction:            " + entry.getKey());
			System.out.println("Covered DC Paths:    " + entry.getValue().coveredDCPaths);
			System.out.println("Covered Statements:  " + entry.getValue().coveredStatements);
			System.out.println("Covered Decisions T: " + entry.getValue().coveredDecisionsTrue);
			System.out.println("Covered Decisions F: " + entry.getValue().coveredDecisionsFalse);
			
			System.out.println("\nRequired All Defs:   " + entry.getValue().requiredForAllDefs);
			System.out.println("Covered All Defs:    " + entry.getValue().coveredForAllDefs);
			System.out.println("Required All CUses:  " + entry.getValue().requiredForAllCUses);
			System.out.println("Covered All CUses:   " + entry.getValue().coveredForAllCUses);
			System.out.println("Required All PUses:  " + entry.getValue().requiredForAllPUses);
			System.out.println("Covered All PUses:   " + entry.getValue().coveredForAllPUses);
		}
		
		
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

}
