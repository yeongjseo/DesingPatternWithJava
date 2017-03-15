package behavioral.template_method;

/*
 * The AbstractClass contains the templateMethod(), 
 * which should be made final 
 * so that it cannot be overridden. 
 * This template method makes use of other operations available 
 * in order to run the algorithm, 
 * but is decoupled for the actual implementation of these methods. 
 * 
 * All operations used by this template method are made abstract, 
 * so their implementation is deferred to subclasses.
 */
public abstract class AbstractClass {

	public abstract void subMethod1();
	public abstract void subMethod2();

	/*
	 * A method that calls any of the methods listed above 
	 * in order to describe the algorithm 
	 * without needing to implement the details.
	 */
	public final void templateMethod() {
		subMethod1();
		System.out.println("templateMethod");
		subMethod2();
	}
}
