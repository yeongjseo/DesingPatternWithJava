package structural.adapter;

/*
 * the Adaptee is the existing interface 
 * that needs adapting 
 * in order for our client to interact with it.
 * 
 */
public class Adaptee {
    private String name;
    public Adaptee(String name) {
        this.name = name;
    }
    
    public String getName() {
		return name;
	}
    
    public void adaptedOperation(int msg) {
        System.out.println(name + " operates " + msg);
    }
}
