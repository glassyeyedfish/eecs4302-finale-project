package proglang.model.expressions;

public class PLBooleanBrackets extends PLBooleanExpression {
	private PLBooleanExpression expression;

	public PLBooleanBrackets(PLBooleanExpression expression) {
		this.expression = expression;
	}

	public PLBooleanExpression getExpression() {
		return expression;
	}

	@Override
	public Boolean evaluate() {
		return expression.evaluate();
	}

	@Override
	public boolean hasVariable(String key) {
		return this.expression.hasVariable(key);
	}
}
