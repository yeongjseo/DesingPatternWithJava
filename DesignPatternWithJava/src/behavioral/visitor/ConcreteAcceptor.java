package behavioral.visitor;

/*
 * ConcreteAcceptor will implement this accept method.
 */
public class ConcreteAcceptor implements Acceptor {
	String name;
	
	public ConcreteAcceptor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
