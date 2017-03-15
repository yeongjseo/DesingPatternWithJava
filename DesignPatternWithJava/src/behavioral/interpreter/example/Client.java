package behavioral.interpreter.example;

/*
 * 
 */
public class Client {
    public static void main(String[] args) {
    	String hexadecimal = "0xABCD";
    	String binary = "b1010010";
    	Context context = new Context(hexadecimal);
    	Expression expression = new HexadecimalExpression();
    	expression.interpret(context);
    	int decimal = context.getDecimal();
    	System.out.println(hexadecimal + " --> " + decimal);
    	
    	context = new Context(binary);
    	expression = new BinaryExpression();
    	expression.interpret(context);
    	decimal = context.getDecimal();
    	System.out.println(binary + " --> " + decimal);
    	
    }
}
