package structural.bridge;

public class ConcreteImplementorB extends Implementor {
	public ConcreteImplementorB(String name) {
		super(name);
	}
	
	@Override
	public void operationImplement() {
		System.out.println(getName() + " implements operation.");
	}
}
