package creational.abstract_factory.example;

/*
 * AbstractFactory 
 */
public interface Factory {
	public CellPhone createCellPhone();
	public TabletPC createTabletPC();
}
