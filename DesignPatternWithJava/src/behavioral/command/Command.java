package behavioral.command;

/*
 * Command declares an interface for all commands, 
 * providing a simple execute() method 
 * which asks the Receiver of the command to carry out an operation.
 */
public interface Command {
	public void execute(String request);
}
