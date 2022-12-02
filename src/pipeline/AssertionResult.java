package pipeline;

import com.google.gson.annotations.Expose;

public class AssertionResult {
	@Expose
	public Boolean isSuccess;
	@Expose
	public Integer lineNum;
	
	public AssertionResult(Boolean isSuccess, Integer lineNum) {
		this.isSuccess = isSuccess;
		this.lineNum = lineNum;
	}
	
	@Override
	public String toString() {
		return "(" + isSuccess + " @ " + lineNum + ")";
	}
}
