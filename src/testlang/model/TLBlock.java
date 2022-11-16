package testlang.model;

public abstract class TLBlock {
	private int startLineNum;
	private int endLineNum;
	
	public TLBlock(int startLineNum, int endLineNum) {
		this.startLineNum = startLineNum;
		this.endLineNum = endLineNum;
	}

	public int getStartLineNum() {
		return startLineNum;
	}

	public int getEndLineNum() {
		return endLineNum;
	}

}
