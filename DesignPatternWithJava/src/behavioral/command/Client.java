package behavioral.command;

/*
 * The Client creates ConcreteCommands and sets a Receiver for the command.
 *  
 * The ConcreteCommand defines a binding between the action and the receiver. 
 */
public class Client {
	public static void main(String[] args) {
		
		// Create receiver, command, and invoker
		Invoker invoker = new Invoker();
		Receiver receiver = new Receiver("receiver1");
		Command command = new ConcreteCommand(receiver);

		// Set and execute command
		invoker.setCommand(command);
		invoker.execute("request");
	}
}
