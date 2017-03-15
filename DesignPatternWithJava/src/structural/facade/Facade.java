package structural.facade;

public class Facade {
	private String name;
	private SubSystem1 subSystem1 = new SubSystem1();
	private SubSystem2 subSystem2 = new SubSystem2();
	
	public Facade(String name) {
		this.name = name;
	}
	
	public void doA() {
		subSystem1.doA();
		subSystem2.doA();
	}
	
	public void doB() {
		subSystem1.doB();
		subSystem2.doB();
	}
}

