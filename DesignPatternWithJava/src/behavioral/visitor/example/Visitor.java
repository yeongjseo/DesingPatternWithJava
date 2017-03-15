package behavioral.visitor.example;

/*
 * Visitor interface defines a visit operation 
 * for each type of Acceptor in the object structure. 
 */
public interface Visitor {
	void visit(Employee employee);
}
