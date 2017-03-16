package structural.flyweight;

/*
 * ConcreteFlyweight adds capabilities for intrinsic state. 
 * This flyweight object must be sharable
 * 
 * 
 */
public class ConcreteFlyweight implements Flyweight {
	/*
	 * Intrinsic data is the data 
	 * that makes this object instance unique.
	 */
	String intrinsic;
	
	
	public ConcreteFlyweight(String intrinsic) {
		this.intrinsic = intrinsic;
	}
	
	/*
	 * Extrinsic data is information 
	 * that can be passed in through arguments.
	 * 
	 */
	public void operation(String extrinsic) {
		System.out.println("intrinsic data: " + intrinsic);
		System.out.println("extrinsic data: " + extrinsic);
	}
	
	public String getIntrinsic() {
		return intrinsic;
	}

	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
}
