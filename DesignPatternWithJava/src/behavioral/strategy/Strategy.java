package behavioral.strategy;

/*
 * The Strategy is simply implemented as an interface, 
 * so that we can swap ConcreteStrategys in and out 
 * without effecting our Context.
 * 
 */
public interface Strategy {
	public String getName();
    public void execute(Context context, String argument);
}
