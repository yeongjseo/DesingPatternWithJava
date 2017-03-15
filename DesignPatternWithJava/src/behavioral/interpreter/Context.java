package behavioral.interpreter;

/*
 * Context contains information 
 * that is global to the interpreter
 */
public class Context {
	String name;

	public Context(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
