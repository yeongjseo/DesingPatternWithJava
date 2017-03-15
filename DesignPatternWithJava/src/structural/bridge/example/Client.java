package structural.bridge.example;

public class Client {
	public static void main(String[] args) {
		// Create Bridge
		Customers customers = new Customers("Seoul");

		// Set ConcreteImplementor
		customers.setData(new CustomersData());

		// Exercise the bridge
		customers.show();
		customers.next();
		customers.show();
		customers.next();
		customers.show();
		customers.add("Henry Velasquez");

		System.out.println();
		customers.showAll();
	}
}
