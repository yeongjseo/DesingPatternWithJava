package behavioral.iterator.example;

public class CollectionIterator implements Iterator {
	private Collection collection;
	private int index;
	public CollectionIterator(Collection collection) {
		this.collection = collection;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < collection.size()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Item element = collection.get(index);
		index++;
		return element;
	}
}
