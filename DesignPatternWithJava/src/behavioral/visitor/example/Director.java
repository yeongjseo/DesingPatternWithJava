package behavioral.visitor.example;

/*
 * ConcreteAcceptor will implement this accept method.
 */
public class Director extends Employee {
	
	public Director(String name, double income, int vacationDays) {
		super(name, income, vacationDays);
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public String getType() {
		return "Director";
	}
}
