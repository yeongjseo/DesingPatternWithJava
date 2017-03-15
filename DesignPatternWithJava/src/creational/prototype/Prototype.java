package creational.prototype;

/*
 * the Prototype interface declares a method for cloning itself,
 * 
 */
public abstract class Prototype implements Cloneable {
	public Prototype clone() {
		Prototype prototype = null;     
		try {               
			prototype = (Prototype) super.clone();             
		} catch (CloneNotSupportedException e) {          
			e.printStackTrace();          
		}     
		return prototype;   
	}    
}



