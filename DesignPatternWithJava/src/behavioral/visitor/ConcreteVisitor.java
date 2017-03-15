package behavioral.visitor;

/*
 * the ConcreteVisitor implements the operations defined in the Visitor interface. 
 * The concrete visitor will store local state, 
 * typically as it traverses the set of Acceptors. 
 * 
 * The Acceptor interface simply defines an accept method 
 * to allow the visitor to run some action over that Acceptor 
 * 
 */
public class ConcreteVisitor implements Visitor {
	String name;
	
	public ConcreteVisitor(String name) {
		this.name = name;
	}
	
	public void visit(Acceptor acceptor) {
		System.out.println(name + " visits " + acceptor.getName());
	}
}
