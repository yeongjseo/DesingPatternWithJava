package structural.adapter;

/*
 * The Adapter interface defines the domain specific interface 
 * that the Client used,
 *  
 * so the client collaborates with objects that implement the Adapter interface.
 * 
 * 
 */
public interface Adapter {
	public String getName();
	public void operation(String msg);
}
