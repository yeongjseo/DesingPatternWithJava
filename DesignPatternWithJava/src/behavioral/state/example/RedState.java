package behavioral.state.example;

/*
 * ConcreteState 
 */
public class RedState extends State {
	private double serviceFee;

	public RedState(State state) {
		super(state);
		init();
	}

	private void init() {
		// Should come from a datasource
		interest = 0.0;
		lowerLimit = -100.0;
		upperLimit = 0.0;
		serviceFee = 15.00;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		stateChangeCheck();
	}

	@Override
	public void withdraw(double amount)	{
		amount = amount - serviceFee;
		System.out.println("No funds available for withdrawal!");
	}

	@Override
	public void payInterest() {
		// No interest is paid
	}

	private void stateChangeCheck() {
		if (balance > upperLimit) {
			account.setState( new SilverState(this));
		}
	}
	
	public String getStateName() {
		return "Red";
	}
}
