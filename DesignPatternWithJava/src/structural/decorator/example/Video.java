package structural.decorator.example;

/*
 * ConcreteComponent 
 */
public class Video extends Item {
	private String director;
	private String title;
	private int playTime;
	
	
	public Video(String director, String title, int playTime, int numCopies) {
		super(numCopies);
		this.director = director;
		this.title = title;
		this.playTime = playTime;
	}
	
	@Override
	public void display() {
		System.out.println("Video ----");
		System.out.println("  Title: " + title);
		System.out.println("  Director: " + director);
		System.out.println("  Play Time: " + playTime);
		System.out.println("  # Copies: " + numCopies);
	}
}
