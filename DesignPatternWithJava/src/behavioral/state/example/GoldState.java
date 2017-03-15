package behavioral.state.example;

/*
 * ConcreteState 
 */
public class GoldState extends State {

	public GoldState(State state) {
		super(state);
		init();
	}

	private void init() {
		// Should come from a datasource
		interest = 0.05;
		lowerLimit = 1000.0;
		upperLimit = 10000000.0;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		stateChangeCheck();
	}

	@Override
	public void withdraw(double amount)	{
		balance -= amount;
		stateChangeCheck();
	}

	@Override
	public void payInterest() {
		balance += interest * balance;
		stateChangeCheck();
	}

	private void stateChangeCheck() {
		if (balance < 0.0) {
			account.setState(new RedState(this));
		} else if (balance < lowerLimit) {
			account.setState(new SilverState(this));
		}
	}
	
	public String getStateName() {
		return "Gold";
	}
}
