package behavioral.command.example;

/*
 * The Client creates ConcreteCommands and sets a Receiver for the command.
 *  
 * The ConcreteCommand defines a binding between the action and the receiver. 
 */
public class Client {
	public static void main(String[] args) {
		
		// Create receiver, command, and invoker
		Computer computer = new Computer();
		
		computer.compute('+', 100);
		computer.compute('-', 50);
		computer.compute('/', 2);
		computer.compute('*', 3);
		
		computer.undo(2);
		
		
		computer.redo(2);
		

	}
}
