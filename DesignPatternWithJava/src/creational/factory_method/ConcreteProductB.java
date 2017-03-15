package creational.factory_method;

public class ConcreteProductB extends Product {
	
	ConcreteProductB(String name) {
		super(name);
	}

	public void use() {
		System.out.println("use " + name);
	}
}
