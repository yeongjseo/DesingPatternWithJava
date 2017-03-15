package creational.abstract_factory.example;

/*
 * ConcreteFactory1 and ConcreteFactory2 have both implemented this interface here, 
 * creating two seperate families of product.
 * 
 */
public class SamsungFactory implements Factory {

	@Override
	public CellPhone createCellPhone() {
		return new GalaxyPhone();
	}

	@Override
	public TabletPC createTabletPC() {
		return new GalaxyTab();
	}

}
