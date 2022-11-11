package proglang.expressions;

public class PLLessThanOrEqualTo extends PLRelationalOperation {
	public PLLessThanOrEqualTo(PLArithmeticExpression left, PLArithmeticExpression right) {
		super(left, right);
	}
	
	@Override
	public Boolean evaluate() {
		return getLeft().evaluate() <= getRight().evaluate();
	}	
}
