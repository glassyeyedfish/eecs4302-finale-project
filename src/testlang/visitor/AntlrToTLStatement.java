package testlang.visitor;

import java.util.ArrayList;
import java.util.List;

import testlang.antlr.TestLangBaseVisitor;
import testlang.antlr.TestLangParser.ExprContext;
import testlang.antlr.TestLangParser.TLFunctionCallContext;
import testlang.model.TLFunctionCall;
import testlang.model.TLStatement;
import testlang.model.expressions.TLExpression;

public class AntlrToTLStatement extends TestLangBaseVisitor<TLStatement> {
	
	private AntlrToTLExpression eVisitor;
	
	public AntlrToTLStatement() {
		this.eVisitor = new AntlrToTLExpression();
	}

	@Override
	public TLFunctionCall visitTLFunctionCall(TLFunctionCallContext ctx) {
		String name = ctx.ID().getText();
		List<TLExpression<?>> args = new ArrayList<>();
		int lineNum = AntlrToTLProgram.currentLineNum;
		
		for (ExprContext a: ctx.expr()) {
			args.add(eVisitor.visit(a));
		}
		
		return new TLFunctionCall(name, args, lineNum);
	}

}
