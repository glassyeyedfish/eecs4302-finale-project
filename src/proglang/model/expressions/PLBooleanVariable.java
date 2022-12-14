package proglang.model.expressions;

import pipeline.Store;

public class PLBooleanVariable extends PLBooleanExpression {
	private String id;
	
	public PLBooleanVariable(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}

	@Override
	public Boolean evaluate() {
		return Store.getBoolVariable(id);
	}

	@Override
	public boolean hasVariable(String key) {
		return this.id.equals(key);
	}
}
