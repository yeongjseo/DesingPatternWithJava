package structural.adapter.example;

/*
 * 
 */
public class RichCompound extends Compound {
	ChemicalData data;
	
    public RichCompound(String name) {
        super(name);
    }
    
    public void display() {
    	data = new ChemicalData();
    	boilingPoint = data.getBoilingPoint(compound);
    	meltingPoint = data.getMeltingPoint(compound);
    	molecularWeight = data.GetMolecularWeight(compound);
    	molecularFormula  = data.GetMolecularStructure(compound);
    	
    	super.display();
    	System.out.println("  Formula: " + molecularFormula);
    	System.out.println("  Weight: " + molecularWeight);
    	System.out.println("  Melting Point: " + meltingPoint);
    	System.out.println("  Boiling Point: " + boilingPoint);
    }
    

}
