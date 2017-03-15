package behavioral.interpreter.example;

/*
 * convert String to a decimal.
 */
public class Context {
	String expression;
	int decimal;

	public Context(String expression) {
		super();
		this.expression = expression;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public int getDecimal() {
		return decimal;
	}

	public void setDecimal(int decimal) {
		this.decimal = decimal;
	}
}
