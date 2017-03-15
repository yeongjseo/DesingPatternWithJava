package structural.composite.example;

/*
 * The Leaf has no children, 
 * and as such only needs to implement the operation method. 
 * 
 */
public class TextView extends View {
	
	public TextView(String name) {
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
		System.out.println("- TextView: " + name);
	}
}
