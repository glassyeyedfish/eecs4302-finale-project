package app;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import testlang.antlr.TestLangLexer;
import testlang.antlr.TestLangParser;
import testlang.model.TLProgram;
import testlang.model.expressions.TLBoolean;
import testlang.model.expressions.TLExpression;
import testlang.model.expressions.TLInteger;
import testlang.visitor.AntlrToTLProgram;

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
		
		TLExpression<?> expr = testProgram.getTestFunctions().get(0)
				.getFunctionCalls().get(0)
				.getArgs().get(0);
		
		if (expr instanceof TLInteger) {
			System.out.println(((TLInteger) expr).getValue());
		} else if (expr instanceof TLBoolean) {
			System.out.println(((TLBoolean) expr).getValue());
		}
		
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
