package behavioral.chain_of_responsibility.example;

/*
 * Request
 */
public class Purchase {
	private int number;
	private double amount;
	private String purpose;
	
	public Purchase(int number, double amount, String purpose) {
		super();
		this.number = number;
		this.amount = amount;
		this.purpose = purpose;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	

}
