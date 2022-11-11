package proglang.expressions;

public class PLSubtraction extends PLArithmeticOperation {
	public PLSubtraction(PLArithmeticOperation left, PLArithmeticOperation right) {
		super(left, right);
	}	
	
	@Override
	public Integer evaluate() {
		return getLeft().evaluate() - getRight().evaluate();
	}
}
