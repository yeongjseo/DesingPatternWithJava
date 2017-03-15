package behavioral.chain_of_responsibility;

public class Request {
	private String name;
	
	public Request(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
