package structural.decorator;

/*
 * the ConcreteComponent is simply an implementation of this interface
 * 
 */
public class ConcreteComponent implements Component {
	private String name;
	
	public ConcreteComponent(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void operation() {
		System.out.println(name + " is operated");
	}
}
