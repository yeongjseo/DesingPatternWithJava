package behavioral.state.example;

import java.text.DecimalFormat;

/*
 * The Context can have a number of internal States,
 *  
 * whenever the request() method is called on the Context, 
 * the message is delegated to the State to handle.
 * 
 */
public class Account {
	private String name;
	private State state;
	DecimalFormat df = new DecimalFormat("$#,###.##");

	public Account(String name) {
		this.name = name;
		// New accounts are 'Silver' by default
		this.state = new SilverState(0.0, this);
	}
	
	public String getName() {
		return name;
	}

	public void setState(State state) {
		this.state = state;
		
	}
	public State getState() {
		return state;
	}
	public void deposit(double amount) {
		state.deposit(amount);
		System.out.println(name + " deposited " + df.format(amount) + " ---");
		System.out.println("  balance: " + df.format(state.getBalance()));
		System.out.println("  state: " + state.getStateName());
		System.out.println();
	}
	public void withdraw(double amount) {
		state.withdraw(amount);
		System.out.println(name + " withdrew " + df.format(amount) + " ---");
		System.out.println("  balance: " + df.format(state.getBalance()));
		System.out.println("  state: " + state.getStateName());
		System.out.println();
		
	}
	public void payInterest() {
		state.payInterest();
		System.out.println(name + " got interest ---");
		System.out.println("  balance: " + df.format(state.getBalance()));
		System.out.println("  state: " + state.getStateName());
		System.out.println();
	}

}
