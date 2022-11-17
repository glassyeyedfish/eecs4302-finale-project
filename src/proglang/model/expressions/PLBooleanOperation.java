package proglang.model.expressions;

public abstract class PLBooleanOperation extends PLBooleanExpression {
	private PLBooleanExpression left;
	private PLBooleanExpression right;
	
	public PLBooleanOperation(PLBooleanExpression left, PLBooleanExpression right) {
		this.left = left;
		this.right = right;
	}

	public PLBooleanExpression getLeft() {
		return left;
	}

	public PLBooleanExpression getRight() {
		return right;
	}
}
