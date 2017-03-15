package structural.facade.example;

public class Credit {
	
	public boolean hasGoodCredit(Customer customer) {
		if (customer.getCredit() < 5)
			return false;
		return true;
	}
}
