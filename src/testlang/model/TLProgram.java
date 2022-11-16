package testlang.model;

import java.util.List;

public class TLProgram extends TLBlock {

	private String name;
	private List<TLTestFunc> testFunctions;
	
	public TLProgram(
			String name, List<TLTestFunc> testFunctions, 
			int startLineNum, int endLineNum
	) {
		super(startLineNum, endLineNum);
		this.name = name;
		this.testFunctions = testFunctions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TLTestFunc> getTestFunctions() {
		return testFunctions;
	}

	public void setTestFunctions(List<TLTestFunc> testFunctions) {
		this.testFunctions = testFunctions;
	}
}
