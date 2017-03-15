package behavioral.strategy.example;

import java.util.Arrays;
import java.util.List;


/*
 * ConcreteStrategy 
 */
public class BubbleSort implements Sort {

	@Override
	public List<String> sort(List<String> list) {
		String[] array = (String[])list.toArray(new String[list.size()]);
		bubbleSort(array);
		return Arrays.asList(array);
	}
	
	public void bubbleSort(String[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (compare(array[j], array[j+1]) < 0) {
                    swap(array,j,j+1);
                }
            }
        }
	}
	
	public int compare(String a, String b) {
		return a.compareTo(b);
	}
	
	public void swap(String array[], int i, int j) {
		// System.out.println(String.format("%s-%s", array[i], array[j]));
		String tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;

	}
	
}
