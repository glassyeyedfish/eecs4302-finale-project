package app;

import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.ProgLangLexer;
import antlr.ProgLangParser;
import proglang.AntlrToPLProgram;
import proglang.PLProgram;

/*
 * Note. 
 * 	This class in the initial starter project is not expected to compile.
 * 	But it should compile after the skeleton code is generated into the `antlr` package. 
 */

public class App {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.print("file name");
			System.exit(1);
		}
		
		String fileName = args[0];
		ProgLangParser parser = getParser(fileName);
		ParseTree AST = parser.prog();
		
		if (ErrorListener.hasError) {
			System.exit(1);
		}
		
		// BEGIN
		AntlrToPLProgram plVisitor = new AntlrToPLProgram();
		PLProgram proglang = (PLProgram) plVisitor.visit(AST);
		
		System.out.println(" === OUTPUT ===");
		System.out.println(proglang.prettyPrint());

		writeToHTML(proglang);
		
	}
	
	private static void writeToHTML(PLProgram proglang) {
		try {
			FileWriter html = new FileWriter("index.html");
			html.write("<!DOCTYPE html>\n");
			html.append("<html>\n");
			html.append("<head><title>Test</title></head>\n");
			html.append("<body>\n");
			html.append("<pre>\n");
			html.append(proglang.prettyPrint());
			html.append("</pre>\n");
			html.append("</body>\n");
			html.append("</html>\n");
			html.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static ProgLangParser getParser(String fileName) {
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

}
