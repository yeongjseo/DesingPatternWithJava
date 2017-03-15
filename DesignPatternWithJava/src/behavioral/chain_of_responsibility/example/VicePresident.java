package behavioral.chain_of_responsibility.example;

/*
 * ConcreteHandlers handle requests that they are responsible for
 */
public class VicePresident extends Approver {
	
	public boolean handleRequest(Purchase purchase) {
		if (purchase.getAmount() < 25000.0) {
			System.out.println("VicePresident approved purchase of " + 
					purchase.getPurpose() + "($" + purchase.getAmount() + ").");
			return true;
		}
		return false;
	}
}
