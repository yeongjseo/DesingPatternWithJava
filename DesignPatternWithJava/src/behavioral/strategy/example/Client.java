package behavioral.strategy.example;

public class Client {
	public static void main(String[] args) {
		SortedList names = new SortedList(new QuickSort());
		names.add("Yeong");
		names.add("Jin");
		names.add("Eun");
		names.add("Hye");
		System.out.println(names);
		names.sort();
		System.out.println(names);
	}
}
