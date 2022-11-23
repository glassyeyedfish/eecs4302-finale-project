package testlang.model;

import java.util.List;

public class TLTestFunc extends TLBlock {
	private String name;
	private List<TLFunctionCall> functionCalls;
	private List<TLAssertion> assertions;
	
	public TLTestFunc(
			String name, List<TLFunctionCall> functionCalls, List<TLAssertion> assertions,
			int startLineNum, int endLineNum
	) {
		super(startLineNum, endLineNum);
		this.name = name;
		this.functionCalls = functionCalls;
		this.assertions = assertions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TLFunctionCall> getFunctionCalls() {
		return functionCalls;
	}

	public void setFunctionCalls(List<TLFunctionCall> functionCalls) {
		this.functionCalls = functionCalls;
	}

	public List<TLAssertion> getAssertions() {
		return assertions;
	}

	public void setAssertions(List<TLAssertion> assertions) {
		this.assertions = assertions;
	}
}
