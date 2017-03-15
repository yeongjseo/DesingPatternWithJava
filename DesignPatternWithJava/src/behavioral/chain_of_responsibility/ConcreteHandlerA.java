package behavioral.chain_of_responsibility;

/*
 * ConcreteHandlers handle requests that they are responsible for
 */
public class ConcreteHandlerA extends Handler {
	
	public boolean handleRequest(Request request) {
		if (request.getName().contains("A")) {
			// handle request
			System.out.println("HandlerA handles the request of " + request.getName());
			return true;
		}
		// not handled
		return false;
	}
}
