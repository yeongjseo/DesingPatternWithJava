package behavioral.state;

/*
 * The Context can have a number of internal States,
 *  
 * whenever the request() method is called on the Context, 
 * the message is delegated to the State to handle.
 * 
 */
public class Context {
	private State state;
	public Context(State state) {
		this.state= state;
	}
	public void setState(State state) {
		System.out.println("State of context is changed from " + this.state.getName() +   
				" to " + state.getName());
		this.state = state;
		
	}
	public State getState() {
		return state;
	}
	public void request(String message) {
		state.handle(this, message);
	}

}
