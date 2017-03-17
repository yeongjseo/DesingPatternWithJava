package structural.proxy;

/*
 * Client may not be able to access the RealSubject 
 * without going through the Proxy
 * 
 */
public class Client {
	public static void main(String[] args) {
		Subject proxy = new Proxy();
		proxy.request("A");
	}
}

