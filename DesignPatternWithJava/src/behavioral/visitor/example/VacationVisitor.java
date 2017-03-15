package behavioral.visitor.example;

/*
 * ConcreteVisitor 
 */
public class VacationVisitor implements Visitor {

	public void visit(Employee employee) {
		employee.setIncome(employee.getIncome() * 1.0);
	    System.out.println(String.format("%s %s's new vacation days are %d", 
	    		employee.getType(), employee.getName(), employee.getVacationDays()));
	      
	}
}
