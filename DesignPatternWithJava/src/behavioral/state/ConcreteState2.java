package behavioral.state;

public class ConcreteState2 extends State {
	public ConcreteState2(String name) {
		super(name);
	}

	public void handle(Context context, String message) {
		System.out.println(getName() + " handles " + message);
		context.setState(new ConcreteState1("state1"));
	}
}
