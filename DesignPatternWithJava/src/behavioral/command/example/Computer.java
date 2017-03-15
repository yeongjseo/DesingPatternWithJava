package behavioral.command.example;

import java.util.ArrayList;
import java.util.List;

/*
 *  Invoker
 */
public class Computer {
	private Calculator calculator = new Calculator();
	private List<Command> commands = new ArrayList<>();
	private int current = 0;

	public void compute(char operator, int operand) {
		Command command = new CalculatorCommand(calculator, operator, operand);
		command.execute();

		commands.add(command);
		current++;
	}

	public void undo(int levels) {
		System.out.println("\n---Undo " + levels + " levels");
		for (int i = 0; i < levels; i++) {
			if (current > 0) {
				Command command = commands.get(--current);
				command.unexecute();
			}
		}
	}

	public void redo(int levels) {
		System.out.println("\n---Redo " + levels + " levels");
		for (int i = 0; i < levels; i++) {
			if (current < commands.size()) {
	          Command command = commands.get(current++);
	          command.execute();
	        }
		}
	}

}
