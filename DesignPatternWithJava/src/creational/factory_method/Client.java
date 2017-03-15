package creational.factory_method;

/*
 * Here we see the client making a call to the abstract Creator, 
 * which then uses the factoryMethod() 
 * to get a new instance of the ConcreteProduct, 
 * complete's the anOperation() method and completes.
 * 
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod("productA");
        product.use();
    }
}
