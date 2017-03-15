package behavioral.chain_of_responsibility.example;

/*
 * ConcreteHandlers handle requests that they are responsible for
 */
public class President extends Approver {
	
	public boolean handleRequest(Purchase purchase) {
		if (purchase.getAmount() < 100000.0) {
			System.out.println("President approved purchase of " + 
					purchase.getPurpose() + "($" + purchase.getAmount() + ").");
			return true;
		}
		return false;
	}
}
