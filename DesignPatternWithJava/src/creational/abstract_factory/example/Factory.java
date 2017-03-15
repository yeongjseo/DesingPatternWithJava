package creational.abstract_factory.example;

/*
 * The AbstractFactory defines the interface 
 * that all of the concrete factories will need 
 * to implement in order to product Products. 
 * 
 */
public interface Factory {
	public CellPhone createCellPhone();
	public TabletPC createTabletPC();
}
