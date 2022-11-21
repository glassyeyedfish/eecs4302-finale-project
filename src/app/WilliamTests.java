package app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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

public class WilliamTests {

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
		}
		
		System.out.println(
				program.getFunctions().get("main")
				.getStatements()
				
		);
		
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
		
		System.out.println(
				testProgram
		);
		
		
		Processor proc = new Processor();
		Map<String, ProcessorData> dataMap = new HashMap<>();
		
		for (Entry<String, PLFunction> entry: program.getFunctions().entrySet()) {
			dataMap.put(entry.getKey(), proc.processPLFunction(entry.getValue()));
		}
		
		System.out.println("\n ===== RESULTS OF PROCESSOR =====");
		for (Map.Entry<String, ProcessorData> entry: dataMap.entrySet()) {
			System.out.println("FUNC: " + entry.getKey());
			System.out.println("All DC Paths: " + entry.getValue().allDCPaths);
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
