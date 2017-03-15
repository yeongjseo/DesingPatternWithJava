package behavioral.template_method.example;

/*
 * AbstractClass
 * Data Access Object
 */
public abstract class DAO {

	public abstract void connect();
	public abstract void select();
	public abstract void process();
	public abstract void disconnect();

	/*
	 * Template method named run() provides a skeleton calling sequence of methods. 
	 */
	public final void run() {
		connect();
		select();
		process();
		disconnect();
		
	}
}
