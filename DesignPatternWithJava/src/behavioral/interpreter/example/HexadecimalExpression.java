package behavioral.interpreter.example;

/*
 *  
 * 
 */
public class HexadecimalExpression extends Expression {

	@Override
	public String prefix() {
		return "0x";
	}

	@Override
	public int prefixLength() {
		return 2;
	}

	@Override
	public int parse(char c) {
		if (c >= '0' && c <= '9')
			return c - '0';
		
		if (c >= 'A' && c <= 'F')
			return c - 'A' + 10;
		
		if (c >= 'a' && c <= 'f')
			return c - 'a' + 10;
		
		return 0;
	}

	@Override
	public int multiplier() {
		return 16;
	}

		
}

