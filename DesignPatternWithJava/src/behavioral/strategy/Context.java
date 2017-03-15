package behavioral.strategy;

/*
 * Context is composed of a Strategy. 
 * The context could be anything that would require changing behaviours 
 * 
 * - a class that provides sorting functionality perhaps.
 * 
 */
public class Context {
	Strategy strategy;
	String name;
	
	public Context(String name, Strategy strategy) {
		this.strategy = strategy;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void execute(String argument) {
		strategy.execute(this, argument);
	}

}
