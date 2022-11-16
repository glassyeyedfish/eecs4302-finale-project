package proglang.model.expressions;

public class PLMultiplication extends PLArithmeticOperation {
	public PLMultiplication(PLArithmeticExpression left, PLArithmeticExpression right) {
		super(left, right);
	}	
	
	@Override
	public Integer evaluate() {
		return getLeft().evaluate() * getRight().evaluate();
	}
}
