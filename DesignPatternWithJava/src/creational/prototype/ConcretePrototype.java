package creational.prototype;

/*
 *  Concrete Prototypes
 */
public class ConcretePrototype extends Prototype {
	String name;

	public ConcretePrototype(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

