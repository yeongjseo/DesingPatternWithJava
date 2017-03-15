package creational.abstract_factory.example;

public class AppleFactory implements Factory {

	@Override
	public CellPhone createCellPhone() {
		return new IPhone();
	}

	@Override
	public TabletPC createTabletPC() {
		return new IPad();
	}

}
