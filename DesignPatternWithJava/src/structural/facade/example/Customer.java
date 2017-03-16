package structural.facade.example;

/*
 * Data
 */
public class Customer {
	String name;
	int saving;
	int loan;
	int credit;
	
	public Customer(String name, int saving, int loan, int credit) {
		super();
		this.name = name;
		this.saving = saving;
		this.loan = loan;
		this.credit = credit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSaving() {
		return saving;
	}
	public void setSaving(int saving) {
		this.saving = saving;
	}
	public int getLoan() {
		return loan;
	}
	public void setLoan(int loan) {
		this.loan = loan;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
}
