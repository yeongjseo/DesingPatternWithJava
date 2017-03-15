package behavioral.visitor.example;

/*
 * ConcreteAcceptor
 */
public class Clerk extends Employee {
	
	public Clerk(String name, double income, int vacationDays) {
		super(name, income, vacationDays);
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	public String getType() {
		return "Clerk";
	}
}
