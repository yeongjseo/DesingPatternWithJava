package behavioral.observer;

public class ConcreteObserverB implements Observer {
	private String name;
	
    public ConcreteObserverB(String name) {
		super();
		this.name = name;
	}
    
    public String getName() {
    	return this.name;
    }
	
    public void update(Subject subject) {
        System.out.println(name + " got update of " + subject.getSubjectState() + 
        					" from " + subject.getName());
    }
}
