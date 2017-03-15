package behavioral.observer;

public class ConcreteObserverA implements Observer {
	private String name;
	
    public ConcreteObserverA(String name) {
		super();
		this.name = name;
	}
    
    public String getName() {
    	return this.name;
    }

	public void update(Subject subject) {
        System.out.println(name + " got update of " + subject.getSubjectState() + 
        					" of " + subject.getName());
    }
}
