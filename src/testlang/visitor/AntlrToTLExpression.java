package testlang.visitor;

import testlang.antlr.TestLangBaseVisitor;
import testlang.antlr.TestLangParser.TLBooleanContext;
import testlang.antlr.TestLangParser.TLIntegerContext;
import testlang.model.expressions.TLBoolean;
import testlang.model.expressions.TLExpression;
import testlang.model.expressions.TLInteger;

public class AntlrToTLExpression extends TestLangBaseVisitor<TLExpression<?>> {

	@Override
	public TLInteger visitTLInteger(TLIntegerContext ctx) {
		return new TLInteger(Integer.parseInt(ctx.INT_LIT().getText()));
	}

	@Override
	public TLBoolean visitTLBoolean(TLBooleanContext ctx) {
		return new TLBoolean(ctx.BOOL_LIT().getText().equals("TRUE") ? true : false);
	}

}
