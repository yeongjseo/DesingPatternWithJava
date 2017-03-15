package behavioral.iterator;

import java.util.ArrayList;

public class ConcreteAggregate implements Aggregate {
	private ArrayList<Element> elements = new ArrayList<>();
	
	public void add(Element element) {
		elements.add(element);                        
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(this);
	}
	
	public int size() {
		return elements.size();
	}
	
	public Element get(int index) {
		return elements.get(index);
	}
}
