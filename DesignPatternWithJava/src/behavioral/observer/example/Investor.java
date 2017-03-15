package behavioral.observer.example;

/*
 * Observer
 */
public class Investor implements AbstractInvestor {
	private String name;
	
    public Investor(String name) {
		super();
		this.name = name;
	}
    
    public String getName() {
    	return this.name;
    }

	public void update(AbstractStock subject) {
        System.out.println(name + " got update of $" + subject.getPrice() + 
        					" of " + subject.getName());
    }
}
