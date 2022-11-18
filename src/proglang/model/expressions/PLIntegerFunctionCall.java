package proglang.model.expressions;

import java.util.ArrayList;
import java.util.List;

public class PLIntegerFunctionCall extends PLArithmeticExpression {

	private String id;
	private List<PLExpression<?>> arguments;
	
	public PLIntegerFunctionCall(String id) {
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
		this.arguments.add(arg);
	}
	
	@Override
	public Integer evaluate() {
		// USE STORE HERE!!!
		return null;
	}

}
