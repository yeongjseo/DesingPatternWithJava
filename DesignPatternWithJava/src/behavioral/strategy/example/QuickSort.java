package behavioral.strategy.example;

import java.util.Arrays;
import java.util.List;


/*
 * ConcreteStrategy 
 */
public class QuickSort implements Sort {

	@Override
	public List<String> sort(List<String> list) {
		String[] array = (String[])list.toArray(new String[list.size()]);
		quickSort(array, 0, array.length - 1);

		return Arrays.asList(array);
	}
	
	
	public void quickSort(String[] array, int min, int max) {
		int i = min;
        int j = max;
        
        // calculate pivot number, I am taking pivot as middle index number
        String pivot = array[min + (max - min) / 2];
        // System.out.println("pivot=" + pivot);
        // Divide into two arrays
        while (i <= j) {
            /*
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
        	// System.out.println(String.format("1. i=%d, j=%d", i, j));
        	// find item greater than pivot from left
            while (compare(array[i], pivot) < 0) {
                i++;
            }
            // find iterm less item than pivot from right
            while (compare(array[j], pivot) > 0) {
                j--;
            }
            // System.out.println(String.format("2. i=%d, j=%d", i, j));
            if (i <= j) {
                swap(array, i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (min < j)
            quickSort(array, min, j);
        if (i < max)
            quickSort(array, i, max);
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
