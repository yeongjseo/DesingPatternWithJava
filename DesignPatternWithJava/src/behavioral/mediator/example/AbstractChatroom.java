package behavioral.mediator.example;

/*
 *  Mediator 
 */
public interface AbstractChatroom {
	public void addParticipant(AbstractParticipant participant);
    public void send(String message, AbstractParticipant participant);
}
