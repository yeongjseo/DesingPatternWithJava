package behavioral.observer.example;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * One of more Observers are interested in the state of a Subject and 
 * register their interest with the Subject by attaching themselves.
 * 
 */
public abstract class AbstractStock {
	private ArrayList<AbstractInvestor> observers = new ArrayList<>();
	String name;

	public AbstractStock(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void attach(AbstractInvestor observer) {
		observers.add(observer);
	}
	public void detach(AbstractInvestor observer) {
		observers.remove(observer);
	}
	
	/*
	 * When something changes in our Subject 
	 * that the Observer may be interested in, 
	 * a notify message is sent, 
	 * which calls the update method in each Observer. 
	 */
	public void notifyObserver() {
		Iterator<AbstractInvestor> it = observers.iterator();      
		while (it.hasNext()) {                 
			AbstractInvestor o = (AbstractInvestor)it.next();
			o.update(this);                   
		}                                     
	}                                      
	public abstract double getPrice();
	public abstract void setPrice(double price);

}
