package structural.adapter;

/*
 * The ConcreteAdapter adapts the Adaptee to the Adapter interface
 *  
 * - in other words, it translates the request from the client to the adaptee. 
 * 
 */
public class ConcreteAdapter implements Adapter {
	private String name;
	Adaptee adaptee = new Adaptee("adaptee");
	
    public ConcreteAdapter(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
    	return this.name;
    }

	@Override
	public void operation(String msg) {
		System.out.println(name + " adaptes " + adaptee.getName());
		
		int i = Integer.parseInt(msg);
		adaptee.adaptedOperation(i);
	}
}
