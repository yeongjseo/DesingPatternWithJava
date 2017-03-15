package creational.builder;

/*
 * ConcreteBuilder provides an implementation of this interface.
 * 
 * The ConcreteBuilder keep track of the representation it creates, 
 * provides a way to get the result (Product) 
 * as well as constructing the product. 
 */
public class ConcreteBuilderA extends Builder {
	// complex object
	private StringBuffer buffer = new StringBuffer();
	public void buildPart1(String part1) {
		buffer.append("builderA builds " + part1 + "\n");
	}
	
	public void buildPart2(String part2) {
		buffer.append("builderA builds " + part2 + "\n");
	}
	
	public String getResult() {
		return buffer.toString();
	}
}
