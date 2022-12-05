package proglang.model.expressions;

import pipeline.Store;

public class PLIntegerVariable extends PLArithmeticExpression {
	private String id;
	
	public PLIntegerVariable(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}

	@Override
	public Integer evaluate() {
		return Store.getIntVariable(id);
	}

	@Override
	public boolean hasVariable(String key) {
		return this.id.equals(key);
	}
}
