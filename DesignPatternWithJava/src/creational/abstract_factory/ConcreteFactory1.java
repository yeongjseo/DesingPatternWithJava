package creational.abstract_factory;

/*
 * ConcreteFactory1 and ConcreteFactory2 have both implemented this interface here, 
 * creating two seperate families of product.
 * 
 */
public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB1();
	}

}
