package structural.composite;

import java.util.ArrayList;
import java.util.List;

/*
 * The Composite needs to do more, as it also contains components. 
 * The composite will more than likely need to implement the operation method, 
 * which is considered as a Leaf-related operation. 
 * 
 * Sometimes this may not make sense for a composite to implement.
 * 
 */
public class Composite extends Component {
	List<Component> components = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		components.add(component);
	}

	@Override
	public void remove(Component component) {
		if (components.contains(component))
			components.remove(component);
	}

	@Override
	public Component getChild(int index) {
		if (index < components.size()) {
			return components.get(index);
		}
		return null;
	}

	@Override
	public void operation(int depth) {
		for (int d = 0; d < depth; d++)
			System.out.print(" ");
		System.out.println("+ " + name);
		
		for (Component component: components) {
			component.operation(depth + 1);
		}
	}
}
