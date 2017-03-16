package structural.composite.example;

import java.util.ArrayList;
import java.util.List;

/*
 * Composite 
 */
public class ViewGroup extends View {
	List<View> views = new ArrayList<View>();

	public ViewGroup(String name) {
		super(name);
	}

	@Override
	public void add(View view) {
		views.add(view);
	}

	@Override
	public void remove(View view) {
		if (views.contains(view))
			views.remove(view);
	}

	@Override
	public View getChild(int index) {
		if (index < views.size()) {
			return views.get(index);
		}
		return null;
	}

	@Override
	public void draw(int depth) {
		for (int d = 0; d < depth; d++)
			System.out.print(" ");
		System.out.println("+ ViewGroup: " + name);
		
		for (View component: views) {
			component.draw(depth + 1);
		}
	}
}
