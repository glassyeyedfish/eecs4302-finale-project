package pipeline;

import com.google.gson.annotations.Expose;

public class AssertionResult {
	@Expose
	public Boolean isSuccess;
	@Expose
	public Integer lineNum;
	@Expose
	public String funcName;
	
	public AssertionResult(Boolean isSuccess, Integer lineNum, String funcName) {
		this.isSuccess = isSuccess;
		this.lineNum = lineNum;
		this.funcName = funcName;
	}
	
	@Override
	public String toString() {
		return "(" + isSuccess + " @ " + lineNum + " in " + funcName + ")";
	}
}
