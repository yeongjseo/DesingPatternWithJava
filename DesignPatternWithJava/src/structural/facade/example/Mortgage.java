package structural.facade.example;

public class Mortgage {
	private String name;
	private Bank bank = new Bank();
	private Loan loan = new Loan();
	private Credit credit = new Credit();
	
	public Mortgage(String name) {
		this.name = name;
	}
	
	
	public boolean apply(Customer customer, int amount) {
		boolean elligible = true;
		if (! bank.hasSufficientSavings(customer, amount))
			elligible = false;
		else if (! loan.hasNoBadLoans(customer))
			elligible = false;
		else if (! credit.hasGoodCredit(customer))
			elligible = false;
		
		if (! elligible) {
			System.out.println(customer.getName() + " failed to apply mortgage of $" + amount);
			return false;
		}
		
		System.out.println(customer.getName() + " successfully applied mortgage of $" + amount);
		return true; 
	}
}

