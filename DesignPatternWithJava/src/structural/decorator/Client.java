package structural.decorator;

public class Client {
	public static void main(String[] args){
		Component component = new ConcreteComponent("component");
		
		Decorator decorator = new Decorator("decorator", component);
		decorator.operation();
	}
}

