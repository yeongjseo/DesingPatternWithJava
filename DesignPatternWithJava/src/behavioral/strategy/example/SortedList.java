package behavioral.strategy.example;

import java.util.ArrayList;
import java.util.List;

/*
 * Context is composed of a Strategy. 
 * The context could be anything that would require changing behaviours 
 * 
 * - a class that provides sorting functionality perhaps.
 * 
 */
public class SortedList {
	private Sort sort;
	private List<String> list = new ArrayList<>();
	
	
	public SortedList(Sort strategy) {
		this.sort = strategy;
		
	}
	
	public void add(String name) {
		list.add(name);
	}
	
	public void sort() {
		sort.sort(list);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (String item : list) {
			sb.append(item + ", ");
		}
		sb.append("]");
		return sb.toString();
	}

	
}
