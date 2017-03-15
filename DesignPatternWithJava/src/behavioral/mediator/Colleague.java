package behavioral.mediator;

/*
 * 
 */
public abstract class Colleague {
	private String name;
	private Mediator mediator;
	
	public Colleague(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	// send a message via the mediator
	public void send(String message) {
		mediator.send(message, this);
	}

	// get access to the mediator
	public Mediator getMediator() {
		return mediator;
	}
	public abstract void receive(String message);
}