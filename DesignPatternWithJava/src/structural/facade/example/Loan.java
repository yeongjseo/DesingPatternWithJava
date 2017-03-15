package structural.facade.example;

public class Loan {
	
	public boolean hasNoBadLoans(Customer customer) {
		if (customer.getLoan() > 2)
			return false;
		return true;
	}
	
}
