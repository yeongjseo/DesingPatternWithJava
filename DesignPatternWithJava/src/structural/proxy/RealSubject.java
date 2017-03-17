package structural.proxy;

/*
 * RealSubject
 */
public class RealSubject implements Subject {
	public void request(String name) {
		System.out.println("RealSubject handles request of " + name);
	}
}
