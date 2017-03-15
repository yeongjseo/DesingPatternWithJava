package behavioral.chain_of_responsibility.example;

public class Client {
	public static void main(String[] args){
		// Setup Chain of Responsibility
		Approver director = new Director();
		Approver vicePresident = new VicePresident();
		Approver president = new President();
		
		director.setNext(vicePresident).setNext(president);
		
		// Generate and process purchase requests
		Purchase purchase = new Purchase(2034, 350.00, "Assets");
	    director.handle(purchase);
	 
	    purchase  = new Purchase(2035, 32590.10, "ProjectX");
	    director.handle(purchase);
	 
	    purchase = new Purchase(2036, 122100.00, "ProjectY");
	    director.handle(purchase);
		
		
	}
}

