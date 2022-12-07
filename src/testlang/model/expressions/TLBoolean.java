package testlang.model.expressions;

public class TLBoolean extends TLBooleanExpression {
	public static TLBoolean TRUE = new TLBoolean(true);
	public static TLBoolean FALSE = new TLBoolean(false);
	
	private Boolean value;

	public TLBoolean(Boolean value) {
		super();
		this.value = value;
	}

	@Override
	public Boolean evaluate() {
		return null;
	}

	public Boolean getValue() {
		return value;
	}

	public void setValue(Boolean value) {
		this.value = value;
	}

}
