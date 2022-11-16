package proglang.model.expressions;

public class PLGreaterThan extends PLRelationalOperation {
	public PLGreaterThan(PLArithmeticExpression left, PLArithmeticExpression right) {
		super(left, right);
	}
	
	@Override
	public Boolean evaluate() {
		return getLeft().evaluate() > getRight().evaluate();
	}	
}
