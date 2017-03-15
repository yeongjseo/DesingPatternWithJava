package behavioral.strategy;

public class ConcreteStrategyA implements Strategy {
	private String name;
	
    public ConcreteStrategyA(String name) {
		super();
		this.name = name;
	}
    
    @Override
	public String getName() {
		return name;
	}
	
	@Override
	public void execute(Context context, String argument) {
		System.out.println(name + " excutes " + argument + " in " + context.getName());
	}
}
