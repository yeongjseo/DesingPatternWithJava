package structural.composite;

/*
 * The Client simply uses the Component interface 
 * to manipulate the objects.
 * 
 */
public class Client {
	public static void main(String[] args) {
		Composite composite1 = new Composite("Composite1");

		composite1.add(new Leaf("leaf1"));
		composite1.add(new Leaf("leaf2"));
		
		Composite composite2 = new Composite("Composite2");
		composite2.add(new Leaf("leaf3"));
		composite2.add(new Leaf("leaf4"));
		
		composite1.add(composite2);
		composite1.operation(0);
	}
}
