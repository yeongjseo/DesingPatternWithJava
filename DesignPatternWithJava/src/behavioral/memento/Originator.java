package behavioral.memento;

/*
 * Originator is the object 
 * that knows how to save itself: 
 * 
 * the class that you want to make stateful.
 */
public class Originator {
	String state;
	
	void setMemento(Memento memento) {
		state = memento.getState();
	}
	
	Memento createMemento() {
		return new Memento(state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
