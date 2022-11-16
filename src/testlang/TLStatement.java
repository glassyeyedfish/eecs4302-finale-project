package testlang;

public abstract class TLStatement {
	private int lineNum;

	public TLStatement(int lineNum) {
		super();
		this.lineNum = lineNum;
	}

	public int getLineNum() {
		return lineNum;
	}

	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}

}
