package creational.abstract_factory;

/*
 * The AbstractFactory defines the interface 
 * that all of the concrete factories will need 
 * to implement in order to product Products. 
 * 
 */
public interface AbstractFactory {
	public AbstractProductA createProductA();
	public AbstractProductB createProductB();
}
