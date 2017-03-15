package behavioral.strategy;

public class Client {
	public static void main(String[] args) {
		Context context = new Context("context1", new ConcreteStrategyA("strategyA"));
		context.execute("argument1");

		context = new Context("context2", new ConcreteStrategyB("strategyB"));
		context.execute("argument2");

	}
}
