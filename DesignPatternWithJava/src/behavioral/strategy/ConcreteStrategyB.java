package behavioral.strategy;


public class ConcreteStrategyB implements Strategy {
	private String name;
	
    public ConcreteStrategyB(String name) {
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

