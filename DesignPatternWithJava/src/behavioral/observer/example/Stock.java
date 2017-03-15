package behavioral.observer.example;

/*
 * Subject
 */
public class Stock extends AbstractStock {
	private double price;
	
	
	public Stock(String name) {
		super(name);
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public void setPrice(double price) {
		this.price = price;
		notifyObserver();
	}
}
