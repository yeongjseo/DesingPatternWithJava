package structural.adapter.example;

public class Client {
	public static void main(String[] args) {
		Compound compound = new RichCompound("Water");
		compound.display();
		System.out.println();
		
		compound = new RichCompound("Benzene");
		compound.display();
		System.out.println();
		
		compound = new RichCompound("Ethanol");
		compound.display();
	}
}
