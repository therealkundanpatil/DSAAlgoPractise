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
public class Solution_3 {
	public int[] threeNumberSort(int[] array, int[] order) {
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

	public void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
