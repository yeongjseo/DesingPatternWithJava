package structural.composite.example;

/*
 * Component 
 * 
 */
public abstract class View {
	String name;
	public View(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public abstract void add(View view);
	public abstract void remove(View view);
	public abstract View getChild(int index);
	public abstract void draw(int depth);

}
