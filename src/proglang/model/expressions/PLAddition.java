package proglang.model.expressions;

public class PLAddition extends PLArithmeticOperation {
	public PLAddition(PLArithmeticExpression left, PLArithmeticExpression right) {
		super(left, right);
	}	
	
	@Override
	public Integer evaluate() {
		return getLeft().evaluate() + getRight().evaluate();
	}
}
