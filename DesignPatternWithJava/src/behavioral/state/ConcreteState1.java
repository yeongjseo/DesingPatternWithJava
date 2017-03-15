package behavioral.state;

/*
 * The ConcreteState implements it's own implementation for the request. 
 * 
 * When a Context changes state, 
 * what really happens is that we have a different ConcreteState associated with it.
 * 
 */
public class ConcreteState1 extends State {

	public ConcreteState1(String name) {
		super(name);
	}
	
	public void handle(Context context, String message) {
		System.out.println(getName() + " handles " + message);
		
		context.setState(new ConcreteState2("state2"));
	}
}
