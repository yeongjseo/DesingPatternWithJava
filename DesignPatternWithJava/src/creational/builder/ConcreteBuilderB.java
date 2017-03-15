package creational.builder;

public class ConcreteBuilderB extends Builder {
	private StringBuffer buffer = new StringBuffer();
	public void buildPart1(String part1) {
		buffer.append("builderB builds " + part1 + "\n");
	}
	public void buildPart2(String part2) {
		buffer.append("builderB builds " + part2 + "\n");
	}
	
	public String getResult() {
		return buffer.toString();
	}
}
