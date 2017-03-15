package behavioral.state.example;

/*
 * The State interface defines a common interface for all concrete states, 
 * encapsulating all behaviour associated with a particular state. 
 * 
 */
public abstract class State {
	protected Account account;
	protected double balance;
	protected double interest;
	protected double lowerLimit;
	protected double upperLimit;
	
	public State() {
		
	}
	
	public State(State state) {
		this.account = state.account;
		this.balance = state.balance;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void payInterest();
	public abstract String getStateName();
	

}
