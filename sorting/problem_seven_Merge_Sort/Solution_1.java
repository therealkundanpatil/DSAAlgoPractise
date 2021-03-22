package sorting.problem_seven_Merge_Sort;

import java.util.Arrays;

/**
 * Merge Sort Algorithm
 * 
 * Time Complexity : O(N * log(N) )
 * 
 * Space Complexity : O(N * log(N) )
 * 
 * @author Kundan
 *
 */
public class Solution_1 {
	public static int[] mergeSort(int[] array) {
		// Write your code here.
		if (array.length <= 1) {
			return array;
		}
		int middleIndex = array.length / 2;
		int[] leftHalf = Arrays.copyOfRange(array, 0, middleIndex);
		int[] rightHalf = Arrays.copyOfRange(array, middleIndex, array.length);

		return mergeSortedArrays(mergeSort(leftHalf), mergeSort(rightHalf));
	}

	private static int[] mergeSortedArrays(int[] leftHalf, int[] rightHalf) {
		int[] sortedArray = new int[leftHalf.length + rightHalf.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < leftHalf.length && j < rightHalf.length) {
			if (leftHalf[i] <= rightHalf[j]) {
				sortedArray[k++] = leftHalf[i++];
			} else {
				sortedArray[k++] = rightHalf[j++];
			}
		}

		while (i < leftHalf.length) {
			sortedArray[k++] = leftHalf[i++];
		}

		while (j < rightHalf.length) {
			sortedArray[k++] = rightHalf[j++];
		}

		return sortedArray;
	}

	public static void main(String args[]) {
		int[] a = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] b = mergeSort(a);
		System.out.println(Arrays.toString(b));
	}
}
