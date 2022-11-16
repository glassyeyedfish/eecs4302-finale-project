package testlang.antlrto;

import testantlr.TestLangBaseVisitor;
import testantlr.TestLangParser.TLFunctionCallContext;
import testlang.TLProgram;
import testlang.TLTestFunc;

public class AntlrToTLTestFunc extends TestLangBaseVisitor<TLTestFunc> {

	@Override
	public TLTestFunc visitTLFunctionCall(TLFunctionCallContext ctx) {
		return null;
	}

}
