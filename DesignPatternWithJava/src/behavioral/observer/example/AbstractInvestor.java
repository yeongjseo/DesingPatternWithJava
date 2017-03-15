package behavioral.observer.example;

/*
 * Abstract Observer
 */
public interface AbstractInvestor {
	public String getName();
    public void update(AbstractStock subject);
}
