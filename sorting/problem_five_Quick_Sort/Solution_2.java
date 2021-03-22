package sorting.problem_five_Quick_Sort;

import java.util.Arrays;

/**
 * Quick Sort Algorithm
 * 
 * Time Complexity : O(N*log(N))
 * 
 * Space Complexity : O(log(N))
 * 
 * @author Kundan
 *
 */
public class Solution_2 {
	public static int[] quickSort(int[] array) {
		// Write your code here.
		int start = 0;
		int end = array.length - 1;
		quickSort(array, start, end);

		return array;
	}

	private static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int partitionIndex = partition(array, start, end);
			quickSort(array, start, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, end);
		}
	}

	private static int partition(int array[], int start, int end) {
		int pivot = array[end];
		int i = start - 1;

		for (int j = start; j < end; j++) {
			if (array[j] <= pivot) {
				i++;

				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i + 1];
		array[i + 1] = array[end];
		array[end] = temp;

		return (i + 1);
	}
	
	public static void main(String args[]) {
		int[] a = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] b = quickSort(a);
		System.out.println(Arrays.toString(b));
	}
}
