package behavioral.chain_of_responsibility;

public class ConcreteHandlerB extends Handler {
	
	public boolean handleRequest(Request request) {
		if (request.getName().contains("B")) {
			//handle request
			System.out.println("HandlerB handle the request of " + request.getName());
			return true;
		}
		// not handled
		return false;
	}
}
