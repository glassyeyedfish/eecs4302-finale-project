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
import testlang.*;

public class App {

//	public static void main(String[] args) {
//		if (args.length != 1) {
//			System.err.print("USAGE: [file name]");
//			System.exit(1);
//		}
//		
//		/* Load the test file and parse it. */
//		TLProgram testlang;
//		{
//			String fileName = args[0];
//			TestLangParser parser = getTLParser(fileName);
//			ParseTree AST = parser.prog();
//			
//			if (ErrorListener.hasError) {
//				System.exit(1);
//			}
//			AntlrToTLProgram tlVisitor = new AntlrToTLProgram();
//			testlang = (TLProgram) tlVisitor.visit(AST);
//		}
//		
//		/* Run the tests. */
//		
//		/* Parse and load each program into a list. */
//		List<PLProgram> proglangs = new ArrayList<>();
//		
//		for (AbstractTLStatement s: testlang.statements) {
//			if (s instanceof TLRun) {
//				String progId = ((TLRun) s).id;
//				ProgLangParser parser = getPLParser(progId + ".txt");
//				ParseTree AST = parser.prog();
//
//				// Syntax error handling
//				if (ErrorListener.hasError) {
//					System.exit(1);
//				}
//				
//				AntlrToPLProgram plVisitor = new AntlrToPLProgram();
//				PLProgram proglang = (PLProgram) plVisitor.visit(AST);
//				
//				// Print semantic errors and exit if there are any
//				if (!plVisitor.semanticErrors.isEmpty()) {
//					System.err.print("The following errors occured while parsing: ");
//					System.err.println(progId);
//					for (String msg: plVisitor.semanticErrors) {
//						System.err.println(msg);
//					}
//					System.exit(1);
//				}
//				
//				proglangs.add(proglang);
//			}
//		}
//		
//		CoverageReport report = new CoverageReport();
//		
//		for (PLProgram p: proglangs) {
//			String prettyPrint = p.prettyPrint();
//
//			OldPLProcessor progProcessor = new OldPLProcessor(p);
//			List<Integer> coverage = progProcessor.getStatementCoverage();
//			HashSet<String> allDefsCoverage = progProcessor.getAllDefsCoverage();
//			
//			report.addProgram(prettyPrint, coverage, allDefsCoverage);
//		}
//		
//		report.print();
//		
//		HTML html = new HTML(report);
//		html.outputToFile("index");
//	}
//	
//	@SuppressWarnings("unused")
//	private static void writeToHTML(TLProgram testlang) {
//		try {
//			FileWriter html = new FileWriter("index.html");
//			html.write("<!DOCTYPE html>\n");
//			html.append("<html>\n");
//			html.append("<head><title>Test</title></head>\n");
//			html.append("<body>\n");
//			html.append("<pre>\n");
//			html.append(testlang.prettyPrint());
//			html.append("</pre>\n");
//			html.append("</body>\n");
//			html.append("</html>\n");
//			html.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	private static TestLangParser getTLParser(String fileName) {
//		TestLangParser parser = null;
//		
//		try {
//			CharStream input = CharStreams.fromFileName(fileName);			
//			TestLangLexer lexer = new TestLangLexer(input);
//			CommonTokenStream tokens = new CommonTokenStream(lexer);
//			parser = new TestLangParser(tokens);
//			
//			parser.removeErrorListeners();
//			parser.addErrorListener(new ErrorListener());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return parser;	
//	}
//	
//	private static ProgLangParser getPLParser(String fileName) {
//		ProgLangParser parser = null;
//		
//		try {
//			CharStream input = CharStreams.fromFileName(fileName);			
//			ProgLangLexer lexer = new ProgLangLexer(input);
//			CommonTokenStream tokens = new CommonTokenStream(lexer);
//			parser = new ProgLangParser(tokens);
//			
//			parser.removeErrorListeners();
//			parser.addErrorListener(new ErrorListener());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return parser;	
//	}

}

//PROG LANG
/*PLParser parser = getParser(fileName);
ParseTree AST = parser.prog();

if (ErrorListener.hasError) {
	System.exit(1);
}


AntlrToPLProgram plVisitor = new AntlrToPLProgram();
PLProgram proglang = (PLProgram) plVisitor.visit(AST);

System.out.println(" === OUTPUT ===");
System.out.println(proglang.prettyPrint());

writeToHTML(proglang);*/
