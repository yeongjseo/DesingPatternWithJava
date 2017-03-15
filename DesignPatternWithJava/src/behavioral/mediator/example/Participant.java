package behavioral.mediator.example;

/*
 * The ConcreteColleague communicates with other colleagues 
 * through the mediator.
 */
public class Participant extends AbstractParticipant {
	
	public Participant(String name, AbstractChatroom mediator) {
		super(name, mediator);
	}

	public void receive(String message) {
		System.out.println(getName() + " received message of '" + message + "'");
	}
}