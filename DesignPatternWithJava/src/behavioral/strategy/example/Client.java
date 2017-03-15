package behavioral.strategy.example;

public class Client {
	public static void main(String[] args) {
		SortedList names = new SortedList(new QuickSort());
		names.add("4");
		names.add("2");
		names.add("1");
		names.add("3");
		System.out.println("--Original");
		System.out.println(names);
		names.sort();
		System.out.println("--QuickSort (ascending)");
		System.out.println(names);
		
		names.setSort(new BubbleSort());
		names.sort();
		System.out.println("--BubbleSort (descending)");
		System.out.println(names);
		
		
	}
}
