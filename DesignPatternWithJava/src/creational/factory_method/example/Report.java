package creational.factory_method.example;

/*
 * 
 */
public class Report extends Document {

	@Override
	public void createPages() {
		pages.add(new InstructionPage());
		pages.add(new ResultPage());
		pages.add(new ConclusionPage());		
	}
	
	@Override
	public String getType() {
		return "Report";
	}
}
