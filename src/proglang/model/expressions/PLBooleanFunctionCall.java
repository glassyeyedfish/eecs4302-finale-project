package proglang.model.expressions;

import java.util.ArrayList;
import java.util.List;

public class PLBooleanFunctionCall extends PLBooleanExpression {

	private String id;
	private List<PLExpression<?>> arguments;
	
	public PLBooleanFunctionCall(String id) {
		this.arguments = new ArrayList<>();
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public List<PLExpression<?>> getArguments() {
		return arguments;
	}
	
	public void addArgument(PLExpression<?> arg) {
		this.addArgument(arg);
	}
	
	@Override
	public Boolean evaluate() {
		// USE STORE HERE!!!
		return null;
	}
	
}
