package creational.factory_method.example;

/*
 * ConcreteFactory 
 */
public class Resume extends Document {

	@Override
	public void createPages() {
		pages.add(new SkillPage());
		pages.add(new EducationPage());
		pages.add(new ExperiencePage());		
	}

	@Override
	public String getType() {
		return "Resume";
	}
}
