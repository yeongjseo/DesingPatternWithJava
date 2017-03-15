package creational.prototype;

public class Client {
	public static void main(String[] args) {
		ConcretePrototype prototype = new ConcretePrototype("prototype");
		ConcretePrototype cloned = (ConcretePrototype)prototype.clone();
		
		System.out.println("prototype's name is " + prototype.getName());
		System.out.println("cloned's name is " + cloned.getName());
	}
}
