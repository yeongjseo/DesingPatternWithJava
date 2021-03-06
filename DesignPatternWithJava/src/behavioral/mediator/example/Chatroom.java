package behavioral.mediator.example;

import java.util.ArrayList;

/*
 * ConcreteMediator 
 */
public class Chatroom implements AbstractChatroom {
	private ArrayList<AbstractParticipant> participants;

	public Chatroom() {
		participants = new ArrayList<AbstractParticipant>();
	}

	public void addParticipant(AbstractParticipant participant) {
		participants.add(participant);
	}

	public void send(String message, AbstractParticipant originator) {
		//let all other screens know that this screen has changed
		for (AbstractParticipant participant: participants) {
			//don't tell ourselves
			if (participant != originator) {
				participant.receive(message);
			}
		}
	}
}