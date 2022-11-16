package proglang.model.expressions;

public class PLGreaterThanOrEqualTo extends PLRelationalOperation {
	public PLGreaterThanOrEqualTo(PLArithmeticExpression left, PLArithmeticExpression right) {
		super(left, right);
	}
	
	@Override
	public Boolean evaluate() {
		return getLeft().evaluate() >= getRight().evaluate();
	}	
}
