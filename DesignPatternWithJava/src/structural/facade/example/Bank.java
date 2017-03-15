package structural.facade.example;

public class Bank {

	public boolean hasSufficientSavings(Customer customer, int amount) {
		if (customer.getSaving() < amount)
			return false;
		
		return true;
	}
}
