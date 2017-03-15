package behavioral.observer.example;

/*
 * 
 */
public interface AbstractInvestor {
	public String getName();
    public void update(AbstractStock subject);
}
