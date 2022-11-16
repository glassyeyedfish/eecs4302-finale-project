package app;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import coverage.*;
import html.HTML;
import progantlr.*;
import proglang.*;
import proglang.processor.OldPLProcessor;
import testantlr.*;
import testlang.*;
import testlang.antlrto.AntlrToTLProgram;

public class WilliamTests {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.print("USAGE: [file name]");
			System.exit(1);
		}
		
		/* Load the test file and parse it. */
		TLProgram testProgram;
		{
			String fileName = args[0];
			TestLangParser parser = getTLParser(fileName);
			ParseTree AST = parser.prog();
			
			if (ErrorListener.hasError) {
				System.exit(1);
			}
			AntlrToTLProgram tlVisitor = new AntlrToTLProgram();
			testProgram = tlVisitor.visit(AST);
		}
		
		System.out.println(testProgram.getTestFunctions());
		
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
