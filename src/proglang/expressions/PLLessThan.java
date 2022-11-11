package proglang.expressions;

public class PLLessThan extends PLRelationalOperation {
	public PLLessThan(PLArithmeticExpression left, PLArithmeticExpression right) {
		super(left, right);
	}
	
	@Override
	public Boolean evaluate() {
		return getLeft().evaluate() < getRight().evaluate();
	}	
}
