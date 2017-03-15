package behavioral.memento.example;

/*
 * Originator
 */
public class SalesPerson {
	private String name;
	private String phone;
	private double budget;
	
	public SalesPerson(String name, String phone, double budget) {
		super();
		this.name = name;
		this.phone = phone;
		this.budget = budget;
	}

	void restoreMemento(Memento memento) {
		name = memento.getName();
		phone = memento.getPhone();
		budget = memento.getBudget();
		
	}
	
	Memento saveMemento() {
		return new Memento(name, phone, budget);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return String.format("[name=%s, phone=%s, budget=%f]", name, phone, budget);
	}

}
