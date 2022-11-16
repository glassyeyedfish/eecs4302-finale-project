package testlang.model.expressions;

public class TLBoolean extends TLBooleanExpression {
	private Boolean value;

	public TLBoolean(Boolean value) {
		super();
		this.value = value;
	}

	@Override
	public Boolean evaluate() {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean getValue() {
		return value;
	}

	public void setValue(Boolean value) {
		this.value = value;
	}

}
