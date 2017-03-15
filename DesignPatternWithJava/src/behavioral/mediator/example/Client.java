package behavioral.mediator.example;

public class Client {
	public static void main(String[] args) {
		AbstractChatroom chatroom= new Chatroom();
		Participant participant1 = new Participant("participant1", chatroom);
		Participant participant2 = new Participant("participant2", chatroom);
		chatroom.addParticipant(participant1);
		chatroom.addParticipant(participant2);
		participant1.send("message1");
		participant2.send("message2");
	}
}