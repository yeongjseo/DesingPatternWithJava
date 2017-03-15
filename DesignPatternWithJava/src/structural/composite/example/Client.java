package structural.composite.example;

/*
 * The Client simply uses the Component interface 
 * to manipulate the objects.
 * 
 */
public class Client {
	public static void main(String[] args) {
		ViewGroup layout1 = new ViewGroup("Layout1");

		layout1.add(new TextView("text1"));
		layout1.add(new Button("button1"));
		
		ViewGroup layout2 = new ViewGroup("Layout2");
		layout2.add(new TextView("text2"));
		layout2.add(new Button("button2"));
		
		layout1.add(layout2);
		layout1.draw(0);
	}
}
