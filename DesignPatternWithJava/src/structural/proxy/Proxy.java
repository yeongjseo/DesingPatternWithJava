package structural.proxy;

/*
 * the Proxy would handle the creation of the RealSubject object, 
 * but it will at least have a reference to it 
 * so that it can pass messages along.
 * 
 * 
 */
public class Proxy implements Subject {
	private Subject subject = new RealSubject();
	
	public void request(String name) {
		subject.request(name);
	}
}
