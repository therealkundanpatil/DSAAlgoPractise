package sorting.problem_one_Bubble_Sort;

import java.util.Arrays;

/**
 * Bubble Sort Algorithm
 * 
 * Time Complexity : O(n^2)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class Solution_1 {
	public static int[] bubbleSort(int[] array) {
		// Write your code here.
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 2, 1 };
		int[] b = bubbleSort(a);
		System.out.println(Arrays.toString(b));
	}
}
