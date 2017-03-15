package creational.factory_method;

public class ConcreteProductA extends Product {
    
    ConcreteProductA(String name) {
        super(name);
    }
    
    public void use() {
        System.out.println("use " + name);
    }
}
