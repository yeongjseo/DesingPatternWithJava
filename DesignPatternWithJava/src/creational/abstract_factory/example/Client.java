package creational.abstract_factory.example;

/*
 * 
 */
public class Client {

	public static void main(String[] args) {
		Factory factory = new SamsungFactory();
		CellPhone cellPhone = factory.createCellPhone();
		cellPhone.use();
		TabletPC tablePC = factory.createTabletPC();
		tablePC.use();
		
		System.out.println();
		factory = new AppleFactory();
		cellPhone = factory.createCellPhone();
		cellPhone.use();
		tablePC = factory.createTabletPC();
		tablePC.use();
		
	}
}
