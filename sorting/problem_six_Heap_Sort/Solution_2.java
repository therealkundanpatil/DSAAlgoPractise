package sorting.problem_six_Heap_Sort;

import java.util.Arrays;

/**
 * Heap Sort Algorithm
 * 
 * Time Complexity : O(N * log(N) )
 * 
 * Space Complexity : O( log(N) )
 * 
 * @author Kundan
 *
 */
public class Solution_2 {
	public static int[] heapSort(int[] array) {
		// Write your code here.
		int n = array.length;

		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(array, n, i);
		}

		for (int i = n - 1; i > 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			heapify(array, i, 0);
		}
		return array;
	}

	private static void heapify(int[] array, int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && array[l] > array[largest])
			largest = l;

		if (r < n && array[r] > array[largest])
			largest = r;

		if (largest != i) {
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;
			heapify(array, n, largest);
		}
	}

	public static void main(String args[]) {
		int[] a = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] b = heapSort(a);
		System.out.println(Arrays.toString(b));
	}
}
