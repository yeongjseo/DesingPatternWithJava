package structural.composite.example;

/*
 * Leaf 
 */
public class Button extends View {
	
	public Button(String name) {
		super(name);
	}

	@Override
	public void add(View view) {
		// Unsupported 
	}
	
	@Override
	public void remove(View view) {
		// Unsupported
	}
	
	@Override
	public View getChild(int index) {
		// Unsupported
		return null;
	}
	
	@Override
	public void draw(int depth) {
		for (int d = 0; d < depth; d++)
			System.out.print(" ");
		System.out.println("- Button: " + name);
	}
}
