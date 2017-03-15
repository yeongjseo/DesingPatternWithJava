package behavioral.chain_of_responsibility.example;

/*
 * ConcreteHandlers handle requests that they are responsible for
 */
public class Director extends Approver {
	
	public boolean handleRequest(Purchase purchase) {
		if (purchase.getAmount() < 10000.0) {
			System.out.println("Director approved purchase of " + 
								purchase.getPurpose() + "($" + purchase.getAmount() + ").");
			return true;
		}
		return false;
	}
}
