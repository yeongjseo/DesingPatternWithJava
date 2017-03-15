package behavioral.command.example;

/*
 * Receiver
 */
public class Calculator {
	private int curr = 0;
	
	public void calculate(char operator, int operand) {
		int ocurr = curr;
		switch (operator) {
		case '+': curr += operand; break;
		case '-': curr -= operand; break;
		case '*': curr *= operand; break;
		case '/': curr /= operand; break;
		}
		System.out.println(ocurr + String.valueOf(operator) + operand + "=" + curr);
	}
}
