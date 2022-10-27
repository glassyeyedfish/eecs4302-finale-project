package proglang;

public class PLBoolLiteral extends AbstractPLStatement {
	public boolean value;
	
	public PLBoolLiteral(boolean value) {
		this.value = value;
	}

	@Override
	public String prettyPrint() {
		if (this.value) {
			return "TRUE";
		} else {
			return "FALSE";
		}
	}

}
