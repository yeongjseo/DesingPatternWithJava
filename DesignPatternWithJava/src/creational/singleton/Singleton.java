package creational.singleton;

/*
 * We just provide one point of access to create an instance of the Singleton class. 
 * The constructor is kept private, 
 * giving the getInstance() method the responsibility of providing access to the Singleton.
 * 
 */
public class Singleton {    
	private static Singleton instance;     
	private Singleton() {
		
	}   
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;   
	}
	public void operation() {
		System.out.println("operation");
	}
}
