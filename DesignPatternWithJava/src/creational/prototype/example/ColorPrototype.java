package creational.prototype.example;

/*
 * Prototype
 */
public abstract class ColorPrototype implements Cloneable {
	public ColorPrototype clone() {
		ColorPrototype prototype = null;     
		try {               
			prototype = (ColorPrototype) super.clone();             
		} catch (CloneNotSupportedException e) {          
			e.printStackTrace();          
		}     
		return prototype;   
	}    
}



