package app;

import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class ErrorListener extends BaseErrorListener {
	
	public static boolean hasError;
	
	@Override
	public void syntaxError(
		Recognizer<?, ?> recognizer, 
		Object offendingSymbol,
		int line, 
		int charPositionInLine,
		String msg, RecognitionException e
	) {
		hasError = true;
		
		List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
		Collections.reverse(stack);
		System.err.println("Syntax Error:");
		System.err.println(
			"Token at " 
			+ line + ":" + (charPositionInLine + 1) 
			+ " '" 
			+ ((Token) offendingSymbol).getText()
			+ "' "
			+ msg
		);
		System.err.println("Stack Trace:\n" + stack);
	}

}
