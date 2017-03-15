package behavioral.interpreter;

/*
 * The Client either builds the Abstract Syntax Tree, 
 * or the AST is passed through to the client. 
 * 
 * An AST is composed of both TerminalExpressions and NonTerminalExpressions. 
 * The client will kick off the interpret operation. 
 * 
 * Note that the syntax tree is usually implemented using the Composite pattern
 * 
 */
public class Client {
    public static void main(String[] args) {
    	Context context = new Context("context");
    	AbstractExpression expression = new TerminalExpression();
    	expression.interpret(context);
    	
    }
}
