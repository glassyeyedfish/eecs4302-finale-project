package testlang.model;

import java.util.List;

import testlang.model.expressions.TLExpression;

public class TLFunctionCall extends TLStatement {
	private String name;
	private List<TLExpression<?>> args;
	
	public TLFunctionCall(String name, List<TLExpression<?>> args, int lineNum) {
		super(lineNum);
		this.name = name;
		this.setArgs(args);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<TLExpression<?>> getArgs() {
		return args;
	}

	public void setArgs(List<TLExpression<?>> args) {
		this.args = args;
	}
}
