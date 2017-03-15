package behavioral.command;

/*
 * The Invoker holds a command 
 * and can get the Command to execute a request by calling the execute method.
 */
public class Invoker {
	private Command command;
	public void setCommand(Command command) {
		this.command = command;
	}
	public void execute(String request){
		command.execute(request);
	}
}
