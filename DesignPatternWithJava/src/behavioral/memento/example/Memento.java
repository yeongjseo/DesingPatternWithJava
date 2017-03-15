package behavioral.memento.example;

/*
 *  The Memento holds the information about the Originator's state, 
 *  and cannot be modified by the Caretaker.
 * 
 */
public class Memento {
	String state;
	
	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
