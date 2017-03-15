package structural.composite;

/*
 * The Leaf has no children, 
 * and as such only needs to implement the operation method. 
 * 
 */
public class Leaf extends Component {
	
	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		// Unsupported 
	}
	
	@Override
	public void remove(Component component) {
		// Unsupported
	}
	
	@Override
	public Component getChild(int index) {
		// Unsupported
		return null;
	}
	
	@Override
	public void operation(int depth) {
		for (int d = 0; d < depth; d++)
			System.out.print(" ");
		System.out.println("- " + name);
	}
}
