package proglang.model;

import proglang.model.expressions.PLExpression;

public class PLPrint<T> extends PLStatement {

	private PLExpression<T> expression;
	
	public PLPrint(PLExpression<T> expression, int lineNum) {
		super(lineNum);
		this.expression = expression;
	}

	public PLExpression<T> getExpression() {
		return expression;
	}

	/*
	@Override
	public String toString() {
		return "Output: " + expression.evaluate(); 
	}
	*/

	@Override
	public boolean hasVariable(String key) {
		// TODO Auto-generated method stub
		return expression.hasVariable(key);
	}
}
