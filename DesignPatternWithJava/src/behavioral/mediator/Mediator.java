package behavioral.mediator;

/*
 *  The Mediator defines the interface for communication
 *  between Colleague objects. 
 */
public interface Mediator {
	public void addColleague(Colleague colleague);
    public void send(String message, Colleague originator);
}
