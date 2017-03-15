package behavioral.observer;

import java.util.Random;

public class ConcreteSubject extends Subject {
	private Random random = new Random();
	private String subjectState;
	
	public ConcreteSubject(String name) {
		super(name);
	}
	
	public String getSubjectState() {
		return subjectState;
	}
	
	public void execute() {
		for (int i = 0; i < 3; i++) {
			subjectState = String.valueOf(random.nextInt(5));
			notifyObserver();
		}
	}
}
