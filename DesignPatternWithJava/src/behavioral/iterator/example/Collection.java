package behavioral.iterator.example;

import java.util.ArrayList;

/*
 * ConcreteAggregate
 */
public class Collection implements ICollection {
	private ArrayList<Item> items = new ArrayList<>();
	
	public void add(Item item) {
		items.add(item);                        
	}

	@Override
	public Iterator iterator() {
		return new CollectionIterator(this);
	}
	
	public int size() {
		return items.size();
	}
	
	public Item get(int index) {
		return items.get(index);
	}
}
