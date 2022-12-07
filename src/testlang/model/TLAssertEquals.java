package testlang.model;

import testlang.model.expressions.TLExpression;

public class TLAssertEquals extends TLAssertion {

	public TLAssertEquals(TLFunctionCall left, TLExpression<?> right, int lineNum) {
		super(left, right, lineNum);
	}
}
