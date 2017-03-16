package creational.prototype.example;

/*
 * ConcretePrototype
 */
public class Color extends ColorPrototype {
	protected int red;
	protected int green;
	protected int blue;

	public Color(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
		
	}

	@Override
	public String toString() {
		return String.format("[R:%d, G:%d, B:%d]", red, green, blue);
	}
}

