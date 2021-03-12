package sorting.problem_four_Three_Number_Sort;

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
public class Solution_2 {
	public int[] threeNumberSort(int[] array, int[] order) {
		// Write your code here.
		int firstValue = order[0];
		int thirdValue = order[2];

		int firstIndex = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] == firstValue) {
				swap(array, firstIndex, index);
				firstIndex++;
			}
		}

		int thirdIndex = array.length - 1;
		for (int index = array.length - 1; index >= 0; index--) {
			if (array[index] == thirdValue) {
				swap(array, thirdIndex, index);
				thirdIndex--;
			}
		}

		return array;
	}

	public void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
