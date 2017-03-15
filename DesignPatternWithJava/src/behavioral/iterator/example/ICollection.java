package behavioral.iterator.example;

/*
 * Aggregate
 */
public interface ICollection {
	public void add(Item item);
	public Iterator iterator();
}
