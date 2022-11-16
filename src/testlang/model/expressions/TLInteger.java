package testlang.model.expressions;

public class TLInteger extends TLArithmeticExpression {
	private Integer value;

	public TLInteger(Integer value) {
		super();
		this.value = value;
	}

	@Override
	public Integer evaluate() {
		return value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
