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

public class Solution_3 {
	public static int[] bubbleSort(int[] array) {
		if(array.length == 0 || array.length == 1) {
			return array;
		}
		// Write your code here.
		int temp = 0;
		int length = array.length;
		boolean swapped = false;
		for (int i = 0; i < length - 1; i++) {
			swapped = false;
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
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
