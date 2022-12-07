package testlang.model;

import testlang.model.expressions.TLExpression;

public class TLAssertion extends TLStatement {
	TLFunctionCall left;
	TLExpression<?> right;
	
	public TLAssertion(TLFunctionCall left, TLExpression<?> right, int lineNum) {
		super(lineNum);
		this.left = left;
		this.right = right;
	}
	
	public TLFunctionCall getLeft() {
		return left;
	}

	public void setLeft(TLFunctionCall left) {
		this.left = left;
	}

	public TLExpression<?> getRight() {
		return right;
	}

	public void setRight(TLExpression<?> right) {
		this.right = right;
	}
}
