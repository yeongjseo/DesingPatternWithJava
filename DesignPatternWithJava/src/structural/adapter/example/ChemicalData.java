package structural.adapter.example;

/*
 * 
 * 
 */
public class ChemicalData {
	public double getMeltingPoint(String compound) {
		switch (compound.toLowerCase()) {
		case "water": return 0.0f;
		case "benzene": return 5.5f;
		case "ethanol": return -114.1f;
		default: return 0f;
		}
	}

	public double getBoilingPoint(String compound) {
		switch (compound.toLowerCase()) {
		case "water": return 100.0f;
		case "benzene": return 80.1f;
		case "ethanol": return 78.3f;
		default: return 0f;
		}
	}

	public String GetMolecularStructure(String compound) {
		switch (compound.toLowerCase()) {
		case "water": return "H20";
		case "benzene": return "C6H6";
		case "ethanol": return "C2H5OH";
		default: return "";
		}
	}

	public double GetMolecularWeight(String compound) {
		switch (compound.toLowerCase()) {
		case "water": return 18.015;
		case "benzene": return 78.1134;
		case "ethanol": return 46.0688;
		default: return 0d;
		}
	}


}
