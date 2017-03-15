package behavioral.observer.example;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Abstract Subject 
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
