package proglang.model.expressions;

public abstract class PLRelationalOperation extends PLBooleanExpression {
	private PLArithmeticExpression left;
	private PLArithmeticExpression right;
	
	public PLRelationalOperation(PLArithmeticExpression left, PLArithmeticExpression right) {
		this.left = left;
		this.right = right;
	}

	public PLArithmeticExpression getLeft() {
		return left;
	}

	public PLArithmeticExpression getRight() {
		return right;
	}

}
