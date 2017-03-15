package behavioral.mediator;

/*
 * The ConcreteColleague communicates with other colleagues 
 * through the mediator.
 */
public class ConcreteColleague extends Colleague {
	
	public ConcreteColleague(String name, Mediator mediator) {
		super(name, mediator);
	}

	public void receive(String message) {
		System.out.println(getName() + " received message of '" + message + "'");
	}
}