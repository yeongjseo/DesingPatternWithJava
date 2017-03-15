package creational.factory_method;

public abstract class Product {
	String name;
	Product(String name) {
		this.name = name;
	}
    public abstract void use();
}
