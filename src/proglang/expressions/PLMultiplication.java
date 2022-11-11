package proglang.expressions;

public class PLMultiplication extends PLArithmeticOperation {
	public PLMultiplication(PLArithmeticOperation left, PLArithmeticOperation right) {
		super(left, right);
	}	
	
	@Override
	public Integer evaluate() {
		return getLeft().evaluate() * getRight().evaluate();
	}
}
