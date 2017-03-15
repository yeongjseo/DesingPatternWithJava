package structural.decorator;

/*
 * The Decorator has a reference to a Component, 
 * and also conforms to the  Component interface.
 * 
 * This is the important thing to remember, 
 * as the Decorator is essentially wrapping the Component.
 * 
 */
public class Decorator implements Component {
	private String name;
	private Component component; 
	
	public Decorator(String name, Component component) {
		this.name = name;
		this.component = component;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void operation() {
		System.out.println(name + " decorates " + component.getName());
		component.operation();
		
	}
}
