package structural.adapter;

public class Client {
	public static void main(String[] args) {
		Adapter adapter = new ConcreteAdapter("adapter");
		adapter.operation("123");
	}
}
