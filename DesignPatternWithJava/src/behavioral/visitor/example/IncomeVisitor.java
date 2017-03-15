package behavioral.visitor.example;

/*
 * 
 */
public class IncomeVisitor implements Visitor {

	public void visit(Employee employee) {
		employee.setIncome(employee.getIncome() * 1.0);
	    System.out.println(String.format("%s %s's new income is $%.2f", 
	    		employee.getType(), employee.getName(), employee.getIncome()));
	      
	}
}
