package behavioral.interpreter.example;

/*
 * Thousand checks for the Roman Numeral M 
 * 
 */
public class BinaryExpression extends Expression {

	@Override
	public String prefix() {
		return "b";
	}

	@Override
	public int prefixLength() {
		return 1;
	}

	@Override
	public int parse(char c) {
		if (c >= '0' && c <= '1')
			return c - '0';
		
		return 0;
	}

	@Override
	public int multiplier() {
		return 2;
	}
}

