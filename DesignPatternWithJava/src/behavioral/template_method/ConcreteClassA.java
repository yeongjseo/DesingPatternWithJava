package behavioral.template_method;

public class ConcreteClassA extends AbstractClass { 
	/*
	 * The ConcreteClass implements all the operations required by the templateMethod 
	 * that were defined as abstract in the parent class.
	 *  
	 * There can be many different ConcreteClasses. 
	 */
	public void subMethod1() {
		System.out.println("subMethod A1");
	}
	public void subMethod2() {
		System.out.println("subMethod A2");
	}
}
