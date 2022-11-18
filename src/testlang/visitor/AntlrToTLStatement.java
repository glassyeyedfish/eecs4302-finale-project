package testlang.visitor;

import java.util.ArrayList;
import java.util.List;

import testlang.antlr.TestLangBaseVisitor;
import testlang.antlr.TestLangParser.ExprContext;
import testlang.antlr.TestLangParser.TLAssertContext;
import testlang.antlr.TestLangParser.TLAssertEqualsContext;
import testlang.antlr.TestLangParser.TLFunctionCallContext;
import testlang.model.TLAssert;
import testlang.model.TLAssertEquals;
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
	
	@Override
	public TLStatement visitTLAssertEquals(TLAssertEqualsContext ctx) {
		TLFunctionCall left = visitTLFunctionCall((TLFunctionCallContext) ctx.func_call());
		TLExpression<?> right = eVisitor.visit(ctx.expr());
		int lineNum = AntlrToTLProgram.currentLineNum;
		
		return new TLAssertEquals(left, right, lineNum);
	}
	
	@Override
	public TLStatement visitTLAssert(TLAssertContext ctx) {
		TLFunctionCall left = visitTLFunctionCall((TLFunctionCallContext) ctx.func_call());
		int lineNum = AntlrToTLProgram.currentLineNum;

		return new TLAssert(left, lineNum);
	}

}
