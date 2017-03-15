package structural.decorator.example;

import java.util.ArrayList;
import java.util.List;

/*
 * The Decorator has a reference to a Component, 
 * 
 */
public class Borrowable extends Item {
	private Item item; 
	private List<String> borrowers = new ArrayList<>();
	public Borrowable(Item item) {
		this.item = item;
	}

	@Override
	public void display() {
		item.display();
	}
	
	public void borrowItem(String borrower) {
		borrowers.add(borrower);
		item.decNumCopies();
	}
	
	public void returnItem(String borrower) {
		borrowers.remove(borrower);
		item.incNumCopies();
	}
	
}
