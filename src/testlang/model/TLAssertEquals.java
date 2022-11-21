package testlang.model;

import testlang.model.expressions.TLExpression;

public class TLAssertEquals extends TLAssertion {
	TLFunctionCall left;
	TLExpression<?> right;

	public TLAssertEquals(TLFunctionCall left, TLExpression<?> right, int lineNum) {
		super(left, right, lineNum);
		this.left = left;
		this.right = right;
	}
}
