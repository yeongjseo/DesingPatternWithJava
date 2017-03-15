package behavioral.iterator;

public class ConcreteIterator implements Iterator {
	private ConcreteAggregate aggregator;
	private int index;
	public ConcreteIterator(ConcreteAggregate aggregator) {
		this.aggregator = aggregator;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < aggregator.size()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Element element = aggregator.get(index);
		index++;
		return element;
	}
}
