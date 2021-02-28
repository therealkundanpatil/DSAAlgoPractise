package sorting.problem_two_Insertion_Sort;

import java.util.Arrays;

/**
 * Insertion Sort Algorithm
 * 
 * Time Complexity : O(n^2)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class Solution_1 {
	public static int[] insertionSort(int[] array) {
		if (array.length == 0 || array.length == 1) {
			return array;
		}

		int n = array.length;
		int j = 0;
		for (int i = 1; i < n; i++) {
			j = i;
			while (j > 0 && (array[j - 1] > array[j])) {
				swap(array, j - 1, j);
				j--;
			}
		}

		return array;
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] a = {5,4,3,2,1};
		int[] b = insertionSort(a);
		System.out.println(Arrays.toString(b));
	}
}
