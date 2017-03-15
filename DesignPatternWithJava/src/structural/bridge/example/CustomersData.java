package structural.bridge.example;

import java.util.ArrayList;
import java.util.List;

/*
 * ConcreteImplementor
 */
public class CustomersData extends Data {
	private List<String> customers = new ArrayList<>();
	private int current = 0;
	
	public CustomersData() {
		super();
		// Loaded from a database 
		customers.add("Jim Jones");
		customers.add("Samual Jackson");
		customers.add("Allen Good");
		customers.add("Ann Stills");
		customers.add("Lisa Giolani");
	}

	@Override
	public void nextRecord() {
		if (current <= customers.size() -1) {
			current++;
		}
	}

	@Override
	public void beforeRecord() {
		if (current > 0) {
			current--;
		}
	}

	@Override
	public void addRecord(String name) {
		customers.add(name);
	}

	@Override
	public void deleteRecord(String name) {
		customers.remove(name);
	}

	@Override
	public void showRecord() {
		System.out.println(customers.get(current));
	}

	@Override
	public void showAllRecords() {
		for (String customer: customers) {
			System.out.println(customer + ", ");
		}
	}

}
