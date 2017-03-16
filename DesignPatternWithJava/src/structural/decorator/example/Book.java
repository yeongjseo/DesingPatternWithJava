package structural.decorator.example;

/*
 * ConcreteComponent 
 */
public class Book extends Item {
	private String author;
	private String title;
	
	public Book(String author, String title, int numCopies) {
		super(numCopies);
		this.author = author;
		this.title = title;
	}
	
	@Override
	public void display() {
		System.out.println("Book ----");
		System.out.println("  Title: " + title);
		System.out.println("  Author: " + author);
		System.out.println("  # Copies: " + numCopies);
	}
}
