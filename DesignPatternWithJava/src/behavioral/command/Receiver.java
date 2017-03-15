package behavioral.command;

/*
 * The Receiver has the knowledge of 
 * what to do to carry out the command
 */
public class Receiver {
	String name;
	
	public Receiver(String name) {
		this.name = name;
	}
	
	public void action(String command) {
		System.out.println(name + " receives " + command);
	}
}
