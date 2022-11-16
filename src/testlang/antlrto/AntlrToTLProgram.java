package testlang.antlrto;

import testantlr.TestLangBaseVisitor;
import testantlr.TestLangParser.TLProgramContext;
import testlang.TLProgram;

public class AntlrToTLProgram extends TestLangBaseVisitor<TLProgram> {

	@Override
	public TLProgram visitTLProgram(TLProgramContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTLProgram(ctx);
	}

}
