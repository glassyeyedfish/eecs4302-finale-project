package testlang;

import testantlr.TestLangBaseVisitor;
import testantlr.TestLangParser.TLProgramContext;
import testantlr.TestLangParser.TLRunContext;

public class AntlrToTLProgram extends TestLangBaseVisitor<AbstractTLStatement> {

	@Override
	public TLProgram visitTLProgram(TLProgramContext ctx) {
		TLProgram prog = new TLProgram(ctx.ID().getText());
		
		for (int i = 2; i < ctx.getChildCount() - 2; i++) {
			prog.statements.add(this.visit(ctx.getChild(i)));
		}
		
		return prog;
	}

	@Override
	public TLRun visitTLRun(TLRunContext ctx) {
		TLRun run = new TLRun(ctx.ID().getText());
		return run;
	}

}
