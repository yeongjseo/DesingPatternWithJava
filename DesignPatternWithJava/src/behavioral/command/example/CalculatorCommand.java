package behavioral.command.example;

/*
 * ConcreteCommand
 */
public class CalculatorCommand implements Command {
	private Calculator calculator;
	private char operator;
	private int operand;

	public CalculatorCommand(Calculator calculator, char operator, int operand) {
		this.calculator = calculator;
		this.operator = operator;
		this.operand = operand;
	}

	@Override
	public void execute() {
		calculator.calculate(operator, operand);
	}

	@Override
	public void unexecute() {
		calculator.calculate(undo(operator), operand);
	}
	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	public int getOperand() {
		return operand;
	}
	public void setOperand(int operand) {
		this.operand = operand;
	}

	public char undo(char operarator) {
		switch (operator) {
		case '+': return '-';
		case '-': return '+';
		case '*': return '/';
		case '/': return '*';
		default: System.exit(1); return '?';
		}
	}


}
