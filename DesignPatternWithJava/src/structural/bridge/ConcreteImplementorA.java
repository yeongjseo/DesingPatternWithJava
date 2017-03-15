package structural.bridge;

public class ConcreteImplementorA extends Implementor {
	public ConcreteImplementorA(String name) {
		super(name);
	}
	
	@Override
	public void operationImplement() {
		System.out.println(getName() + " implements operation.");
	}
}
