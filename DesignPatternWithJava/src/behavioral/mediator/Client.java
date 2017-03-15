package behavioral.mediator;

public class Client {
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		ConcreteColleague colleage1 = new ConcreteColleague("colleage1", mediator);
		ConcreteColleague colleage2 = new ConcreteColleague("colleage2", mediator);
		mediator.addColleague(colleage1);
		mediator.addColleague(colleage2);
		colleage1.send("message1");
		colleage2.send("message2");
	}
}