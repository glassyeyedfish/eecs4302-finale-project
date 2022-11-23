package proglang.model.expressions;

public class PLArithmeticBrackets extends PLArithmeticExpression {
	private PLArithmeticExpression expression;

	public PLArithmeticBrackets(PLArithmeticExpression expression) {
		this.expression = expression;
	}

	public PLArithmeticExpression getExpression() {
		return expression;
	}

	@Override
	public Integer evaluate() {
		return expression.evaluate();
	}

	@Override
	public boolean hasVariable(String key) {
		return this.expression.hasVariable(key);
	}
}
