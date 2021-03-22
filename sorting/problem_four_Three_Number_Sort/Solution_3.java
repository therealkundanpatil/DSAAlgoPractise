package sorting.problem_four_Three_Number_Sort;

import java.util.Arrays;

/**
 * Three Number Sort
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class Solution_3 {
	public static int[] threeNumberSort(int[] array, int[] order) {
		// Write your code here.
		int firstValue = order[0];
		int secondValue = order[1];

		int firstIndex = 0;
		int secondIndex = 0;
		int thirdIndex = array.length - 1;

		while (secondIndex <= thirdIndex) {
			int value = array[secondIndex];
			if (value == firstValue) {
				swap(array, firstIndex, secondIndex);
				firstIndex++;
				secondIndex++;
			} else if (value == secondValue) {
				secondIndex++;
			} else {
				swap(array, secondIndex, thirdIndex);
				thirdIndex--;
			}
		}
		return array;
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String args[]) {
		int[] array = { 1, 0, 0, -1, -1, 0, 1, 1 };
		int[] order = { 0, 1, -1 };
		int[] customSortedArray = threeNumberSort(array, order);
		System.out.println(Arrays.toString(customSortedArray));
	}
}
