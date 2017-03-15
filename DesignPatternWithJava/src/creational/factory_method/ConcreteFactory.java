package creational.factory_method;

/*
 * All other methods in our abstract Factory are written 
 * only to operate on the Products created in the ConcreteFactory.
 * 
 */
public class ConcreteFactory extends Factory {
	@Override
	public Product factoryMethod(String name) {
		if (name.contains("productA"))
			return new ConcreteProductA(name);
		else
			return new ConcreteProductB(name);
	}
}
