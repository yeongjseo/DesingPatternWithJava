package creational.abstract_factory.example;

/*
 * ConcreteProductA
 */
public class GalaxyPhone implements CellPhone {
	@Override
	public void use() {
		System.out.println("use GalaxyPhone");
	}
}
