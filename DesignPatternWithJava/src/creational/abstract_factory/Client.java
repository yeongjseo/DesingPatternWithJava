package creational.abstract_factory;

/*
 * The Client deals with AbstractFactory, AbstractProductA and AbstractProductB. 
 * 
 * It doesn't know anything about the implementations. 
 * 
 * The actual implementation of AbstractFactory that the Client uses 
 * is determined at runtime.
 */
public class Client {
	
    public static void main(String[] args) {
    	AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA = factory1.createProductA();
        productA.use();
        AbstractProductB productB = factory1.createProductB();
        productB.use();
    }
}
