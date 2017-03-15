package behavioral.mediator.example;

/*
 * 
 */
public abstract class AbstractParticipant {
	private String name;
	private AbstractChatroom chatroom;
	
	public AbstractParticipant(String name, AbstractChatroom chatroom) {
		this.name = name;
		this.chatroom = chatroom;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	// send a message via the mediator
	public void send(String message) {
		chatroom.send(message, this);
	}

	// get access to the mediator
	public AbstractChatroom getChatroom() {
		return chatroom;
	}
	public abstract void receive(String message);
}