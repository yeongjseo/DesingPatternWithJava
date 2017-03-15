package structural.flyweight;

/*
 * The Flyweight interface declares methods 
 * which flyweight instances can receive and use extrinsic data. 
 * 
 */
public interface Flyweight {
	public String getIntrinsic();
	
	public void operation(String extrinsicData);
}
