package behavioral.strategy.example;

import java.util.ArrayList;
import java.util.List;

/*
 * Context
 */
public class SortedList {
	private Sort sort;
	private List<String> list = new ArrayList<>();
	
	
	public SortedList(Sort sort) {
		this.sort = sort;
		
	}
	
	public void setSort(Sort sort) {
		this.sort = sort;
		
	}
	
	public void add(String name) {
		list.add(name);
	}
	
	public void sort() {
		list = sort.sort(list);
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
