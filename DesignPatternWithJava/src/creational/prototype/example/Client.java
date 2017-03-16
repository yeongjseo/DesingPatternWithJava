package creational.prototype.example;

public class Client {
	public static void main(String[] args) {
		Color red = new Color(255, 0, 0);
		Color green = new Color(0, 255, 0);
		
		Color color = (Color)green.clone();
		
		System.out.println("cloned color's is " + color.toString());
	}
}
