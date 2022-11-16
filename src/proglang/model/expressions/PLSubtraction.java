package proglang.model.expressions;

public class PLSubtraction extends PLArithmeticOperation {
	public PLSubtraction(PLArithmeticExpression left, PLArithmeticExpression right) {
		super(left, right);
	}	
	
	@Override
	public Integer evaluate() {
		return getLeft().evaluate() - getRight().evaluate();
	}
}
