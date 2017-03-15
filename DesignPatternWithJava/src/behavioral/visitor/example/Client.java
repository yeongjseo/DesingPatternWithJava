package behavioral.visitor.example;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {

		Visitor incomeVisitor = new IncomeVisitor();
		Visitor vacationVisitor = new VacationVisitor();

		ArrayList<Employee> employees = new ArrayList<>();

		employees.add(new Clerk("clerk", 1000, 10));
		employees.add(new Director("director", 2000, 20));

		System.out.println("--Income--");
		for (Employee employee: employees) {
			employee.accept(incomeVisitor);	
		}

		System.out.println("\n--Vacation days--");
		for (Employee employee: employees) {
			employee.accept(vacationVisitor);
		}
	}
}

