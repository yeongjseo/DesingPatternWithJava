package creational.abstract_factory.example;

/*
 * ConcreteFactory
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
