package behavioral.chain_of_responsibility.example;

/*
 *  Handler
 *  
 */
public abstract class Approver {
	private Approver next;
	
	public Approver setNext(Approver next) {
		this.next = next;
		return next;
	}
	
	// handle request
	public abstract boolean handleRequest(Purchase purchase);
	
	public final void handle(Purchase purchase){
		if (! handleRequest(purchase)) {
			if (next != null) {
				next.handle(purchase);
			} else {
				System.out.println("Purchase of " + purchase.getPurpose() + " requires an executive meeting.");
			}
		}
	}
}
