package structural.bridge;

public class Client {
	public static void main(String[] args) {
		Bridge bridge = new Bridge(new ConcreteImplementorA("implementorA"));
		bridge.operation();
		
		bridge.setImplementor(new ConcreteImplementorB("implementorB"));
		bridge.operation();
	}
}
