package proglang.model;

import proglang.model.expressions.PLExpression;

public class PLReturn<T> extends PLStatement {
	
	private PLExpression<T> expr;
	
	public PLReturn(PLExpression<T> expr, int lineNum) {
		super(lineNum);
		this.expr = expr;
	}
	
	public T evaluate() {
		return expr.evaluate();
	}
}
