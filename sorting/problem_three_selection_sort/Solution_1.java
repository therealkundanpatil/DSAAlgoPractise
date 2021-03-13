package sorting.problem_three_selection_sort;

import java.util.Arrays;

/**
 * Selection Sort Algorithm
 * 
 * Time Complexity : O(n^2)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class Solution_1 {
	public static int[] selectionSort(int[] array) {
		if (array.length == 0 || array.length == 1) {
			return array;
		}

		int n = array.length;
		int minIndex = 0;
		for (int i = 1; i < n; i++) {
			minIndex = findMinimum(array, i);
			if (array[i - 1] > array[minIndex]) {
				swap(array, minIndex, i - 1);
			}
		}
		return array;
	}

	private static int findMinimum(int[] array, int index) {
		int smallestValue = Integer.MAX_VALUE;
		int smallestIndex = index;
		int n = array.length;
		for (int i = index; i < n; i++) {
			if (array[i] < smallestValue) {
				smallestValue = array[i];
				smallestIndex = i;
			}
		}

		return smallestIndex;
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] a = {5,4,3,2,1};
		int[] b = selectionSort(a);
		System.out.println(Arrays.toString(b));
	}
}
