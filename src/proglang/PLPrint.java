package proglang;

import proglang.expressions.PLExpression;

public class PLPrint<T> extends PLStatement {

	private PLExpression<T> expression;
	
	public PLPrint(PLExpression<T> expression, int lineNum) {
		super(lineNum);
		this.expression = expression;
	}

	public PLExpression<T> getExpression() {
		return expression;
	}

	@Override
	public String toString() {
		return "Output: " + expression.evaluate(); 
	}
}
