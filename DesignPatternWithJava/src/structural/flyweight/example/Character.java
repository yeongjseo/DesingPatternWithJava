package structural.flyweight.example;

/*
 * The Flyweight  
 * 
 */
public abstract class Character {
	// intrinsic
	protected char symbol;
    protected int width;
    protected int height;
    protected int ascent;
    protected int descent;
    protected int pointSize;
	
	public abstract void display(int pointSize);
}
