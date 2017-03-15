package behavioral.state;

/*
 * The State interface defines a common interface for all concrete states, 
 * encapsulating all behaviour associated with a particular state. 
 * 
 */
public abstract class State {
	private String name;
	
	public State(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public abstract void handle(Context context, String message);
}
