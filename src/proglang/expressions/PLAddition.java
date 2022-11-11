package proglang.expressions;

public class PLAddition extends PLArithmeticOperation {
	public PLAddition(PLArithmeticOperation left, PLArithmeticOperation right) {
		super(left, right);
	}	
	
	@Override
	public Integer evaluate() {
		return getLeft().evaluate() + getRight().evaluate();
	}
}
