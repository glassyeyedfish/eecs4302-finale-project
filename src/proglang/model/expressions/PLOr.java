package proglang.model.expressions;

public class PLOr extends PLBooleanOperation {
	public PLOr(PLBooleanExpression left, PLBooleanExpression right) {
		super(left, right);
	}
	
	@Override
	public Boolean evaluate() {
		return getLeft().evaluate() || getRight().evaluate();
	}
}
