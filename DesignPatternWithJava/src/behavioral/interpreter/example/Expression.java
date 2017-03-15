package behavioral.interpreter.example;

/*
 * AbstractExpression
 */
public abstract class Expression {
	public void interpret(Context context)	{
		String expression = context.getExpression();
		int decimal = 0;

		for (int i = 0; i < expression.length(); i++) {
			decimal += (parse(expression.charAt(i)) * multiplier(expression.length() - i - 1));
		}
		context.setDecimal(decimal);
	}

	public abstract String prefix();
	public abstract int prefixLength();
	public abstract int parse(char c);
	public abstract int multiplier();
	public int multiplier(int figure) {
		int multi = 1;
		for (int i = 0; i < figure; i++) {
			multi *= multiplier();
		}
		return multi;
	}

}
