package behavioral.mediator.example;

/*
 *  The Mediator defines the interface for communication
 *  between Colleague objects. 
 */
public interface AbstractChatroom {
	public void addParticipant(AbstractParticipant participant);
    public void send(String message, AbstractParticipant participant);
}
