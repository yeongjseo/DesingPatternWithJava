package structural.decorator.example;

/*
 * 
 */
public abstract class Item {
	protected int numCopies;
	
	public Item() {
		super();
	}
	public Item(int numCopies) {
		super();
		this.numCopies = numCopies;
	}
	public int getNumCopies() {
		return numCopies;
	}
	public void incNumCopies() {
		numCopies++;
	}
	public void decNumCopies() {
		numCopies--;
	}
	public abstract void display();
}
