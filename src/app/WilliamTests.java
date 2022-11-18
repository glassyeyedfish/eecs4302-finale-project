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
import proglang.model.PLFunction;
import proglang.model.PLProgram;
import proglang.visitor.AntlrToProgram;
import testlang.antlr.TestLangLexer;
import testlang.antlr.TestLangParser;

public class WilliamTests {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.print("USAGE: [file name]");
			System.exit(1);
		}
		
		/*
		// TL Stuff
		TLProgram testProgram;
		{
			String fileName = args[0];
			TestLangParser parser = getTLParser(fileName);
			ParseTree AST = parser.prog();
			
			if (ErrorListener.hasError) {
				System.exit(1);
			}
			AntlrToTLProgram visitor = new AntlrToTLProgram();
			testProgram = visitor.visit(AST);
		}
		
		TLExpression<?> expr = testProgram.getTestFunctions().get(0)
				.getFunctionCalls().get(0)
				.getArgs().get(0);
		
		if (expr instanceof TLInteger) {
			System.out.println(((TLInteger) expr).getValue());
		} else if (expr instanceof TLBoolean) {
			System.out.println(((TLBoolean) expr).getValue());
		}
		*/
		
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
		
		Processor proc = new Processor();
		Map<String, ProcessorData> dataMap = new HashMap<>();
		
		for (Entry<String, PLFunction> entry: program.getFunctions().entrySet()) {
			dataMap.put(entry.getKey(), proc.processPLFunction(entry.getValue()));
		}
		
		System.out.println(
				dataMap.get("main").allDCPaths
		);
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
