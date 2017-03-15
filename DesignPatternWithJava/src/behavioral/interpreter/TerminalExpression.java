package behavioral.interpreter;

public class TerminalExpression extends AbstractExpression {
	
	public void interpret(Context context) {
		System.out.println("interpret " + context.getName());
	}
}
