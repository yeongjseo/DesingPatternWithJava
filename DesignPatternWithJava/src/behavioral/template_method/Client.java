package behavioral.template_method;

public class Client {
	public static void main(String[] args) {

		AbstractClass a1 = new ConcreteClassA();
		a1.templateMethod();

		AbstractClass a2 = new ConcreteClassB();
		a2.templateMethod();
	}
}
