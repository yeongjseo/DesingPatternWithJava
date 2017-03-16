package structural.adapter.example;

/*
 * Adapter 
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
