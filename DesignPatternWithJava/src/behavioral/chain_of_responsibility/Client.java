package behavioral.chain_of_responsibility;

public class Client {
	public static void main(String[] args){
		Request[] requests = new Request[3];
		requests[0] = new Request("requestA");
		requests[1] = new Request("requestB");
		requests[2] = new Request("requestC");

		Handler handlerA = new ConcreteHandlerA();
		Handler handlerB = new ConcreteHandlerB();

		handlerA.setNext(handlerB);

		for (Request request : requests) {
			handlerA.handle(request);
		}
	}
}

