package proglang.model.expressions;

public abstract class PLArithmeticOperation extends PLArithmeticExpression {
	private PLArithmeticExpression left;
	private PLArithmeticExpression right;
	
	public PLArithmeticOperation(PLArithmeticExpression left, PLArithmeticExpression right) {
		this.left = left;
		this.right = right;
	}

	public PLArithmeticExpression getLeft() {
		return left;
	}

	public PLArithmeticExpression getRight() {
		return right;
	}

	@Override
	public boolean hasVariable(String key) {
		return getLeft().hasVariable(key) || getRight().hasVariable(key);
	}
}
