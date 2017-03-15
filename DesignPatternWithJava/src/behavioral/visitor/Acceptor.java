package behavioral.visitor;

/*
 *  
 */
public interface Acceptor {
	public String getName();
	public void accept(Visitor visitor);
}
