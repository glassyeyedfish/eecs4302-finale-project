package testlang;

import java.util.List;

public class TLTestFunc extends TLBlock {
	private String name;
	private List<TLFunctionCall> functionCalls;
	
	public TLTestFunc(
			String name, List<TLFunctionCall> functionCalls, 
			int startLineNum, int endLineNum
	) {
		super(startLineNum, endLineNum);
		this.name = name;
		this.functionCalls = functionCalls;
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
}
