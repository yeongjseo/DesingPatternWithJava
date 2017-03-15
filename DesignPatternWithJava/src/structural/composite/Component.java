package structural.composite;

/*
 * The Component interface defines the interface 
 * that all objects in the composed system need to use, 
 * 
 * whether they are leafs (simple objects) or compositions. 
 * 
 */
public abstract class Component {
	String name;
	public Component(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract Component getChild(int index);
	public abstract void operation(int depth);

}
