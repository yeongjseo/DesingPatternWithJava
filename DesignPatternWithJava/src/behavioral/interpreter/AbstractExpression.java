package behavioral.interpreter;

/*
 * The AbstractExpression provides an interface 
 * for executing an operation. 
 */
public abstract class AbstractExpression {
	public abstract void interpret(Context context);
}
