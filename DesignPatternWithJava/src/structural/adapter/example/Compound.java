package structural.adapter.example;

/*
 * The Adapter interface defines the domain specific interface 
 * that the Client used,
 *  
 * so the client collaborates with objects that implement the Adapter interface.
 * 
 * 
 */
public class Compound {
	protected String compound;
	protected double boilingPoint;
    protected double meltingPoint;
    protected double molecularWeight;
    protected String molecularFormula;
	
	
	public Compound(String compound) {
		this.compound = compound;
	}
	public void display() {
		System.out.println("Compound: " + compound + " ----");
	}
}
