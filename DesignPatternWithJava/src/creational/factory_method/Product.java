package creational.factory_method;

/*
 * Product
 */
public abstract class Product {
	String name;
	Product(String name) {
		this.name = name;
	}
    public abstract void use();
}
