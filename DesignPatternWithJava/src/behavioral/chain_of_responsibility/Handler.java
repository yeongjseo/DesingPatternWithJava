package behavioral.chain_of_responsibility;

/*
 *  Handler defines the interface required to handle request
 *  
 *  (optional) implements the next link
 */
public abstract class Handler {
	private Handler next;
	
	// reference to the next handler in the chain
	public Handler setNext(Handler next) {
		this.next = next;
		return next;
	}
	
	// handle request
	public abstract boolean handleRequest(Request request);
	
	public final void handle(Request request){
		if (! handleRequest(request)) {
			if (next != null) {
				next.handle(request);
			} else {
				System.out.println(request.getName() + " has no handler");
			}
		}
		else {
			System.out.println(request.getName() + " is handled");
		}
	}
}
