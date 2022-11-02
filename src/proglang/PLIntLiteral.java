package proglang;

public class PLIntLiteral extends AbstractPLStatement {
	public Integer value;

	public PLIntLiteral(int value) {
		this.value = value;
	}
	
	@Override
	public String prettyPrint() {
		return value.toString();
	}

	@Override
	public int linesInStatement() {
		return 0;
	}
}
