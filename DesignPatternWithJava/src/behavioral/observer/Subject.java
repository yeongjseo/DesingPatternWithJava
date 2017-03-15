package behavioral.observer;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * One of more Observers are interested in the state of a Subject and 
 * register their interest with the Subject by attaching themselves.
 * 
 */
public abstract class Subject {
	private ArrayList<Observer> observers = new ArrayList<>();
	String name;

	public Subject(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	/*
	 * When something changes in our Subject 
	 * that the Observer may be interested in, 
	 * a notify message is sent, 
	 * which calls the update method in each Observer. 
	 */
	public void notifyObserver() {
		Iterator<Observer> it = observers.iterator();      
		while (it.hasNext()) {                 
			Observer o = (Observer)it.next();
			o.update(this);                   
		}                                     
	}                                      
	public abstract String getSubjectState();
	public abstract void execute();

}
