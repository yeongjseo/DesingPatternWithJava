package behavioral.mediator;

import java.util.ArrayList;

/*
 * The ConcreteMediator implements the Mediator interface 
 * and coordinates communication between Colleague objects. 
 * 
 * It is aware of all the Colleagues and their purpose with regards to inter communication.
 * 
 * The ConcreteColleague communicates with other colleagues through the mediator.
 */
public class ConcreteMediator implements Mediator {
	private ArrayList<Colleague> colleagues;

	public ConcreteMediator() {
		colleagues = new ArrayList<Colleague>();
	}

	public void addColleague(Colleague colleague) {
		colleagues.add(colleague);
	}

	public void send(String message, Colleague originator) {
		//let all other screens know that this screen has changed
		for (Colleague colleague: colleagues) {
			//don't tell ourselves
			if (colleague != originator) {
				colleague.receive(message);
			}
		}
	}
}