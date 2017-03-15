package structural.decorator.example;

public class Client {
	public static void main(String[] args){
		Item book = new Book("Seo", "Java", 10);
		Item video = new Video("Kim", "Avatar", 2, 5);
		book.display();
		video.display();
		
		Borrowable borrowable = new Borrowable(book);
		borrowable.borrowItem("Lee");
		borrowable.borrowItem("Song");
		book.display();
		
	}
}

