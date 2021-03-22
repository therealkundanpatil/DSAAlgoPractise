package sorting.problem_five_Quick_Sort;

import java.util.Arrays;

/**
 * Quick Sort
 * 
 * Time Complexity : O(N*log(N))
 * 
 * Space Complexity : O(log(N))
 * 
 * @author Kundan
 *
 */
public class Solution_1 {
	public static int[] quickSort(int[] array) {
		// Write your code here.
		quickSort(array, 0, array.length - 1);
		return array;
	}

	public static void quickSort(int[] array, int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return;
		}

		int pivotIndex = startIndex;
		int leftIndex = startIndex;
		int rightIndex = endIndex;

		while (rightIndex >= leftIndex) {
			if (array[leftIndex] > array[pivotIndex] && array[rightIndex] < array[pivotIndex]) {
				swap(array, leftIndex, rightIndex);
			}
			if (array[leftIndex] <= array[pivotIndex]) {
				leftIndex++;
			}
			if (array[rightIndex] >= array[pivotIndex]) {
				rightIndex--;
			}
		}

		swap(array, pivotIndex, rightIndex);
		boolean leftSubarrayIsSmaller = rightIndex - 1 - startIndex < endIndex - (rightIndex + 1);

		if (leftSubarrayIsSmaller) {
			quickSort(array, startIndex, rightIndex - 1);
			quickSort(array, rightIndex + 1, endIndex);
		} else {
			quickSort(array, rightIndex + 1, endIndex);
			quickSort(array, startIndex, rightIndex - 1);
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String args[]) {
		int[] a = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] b = quickSort(a);
		System.out.println(Arrays.toString(b));
	}
}
