package sorting.problem_four_Three_Number_Sort;

/**
 * Three Number Sort Algorithm
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class Solution_1 {
	public int[] threeNumberSort(int[] array, int[] order) {
		// Write your code here.
		int[] valueCounts = new int[] { 0, 0, 0 };

		for (int element : array) {
			int orderIndex = getIndex(order, element);
			valueCounts[orderIndex] += 1;
		}

		for (int i = 0; i < 3; i++) {
			int value = order[i];
			int count = valueCounts[i];

			int numElementsBefore = getSum(valueCounts, i);

			for (int n = 0; n < count; n++) {
				int currentIndex = numElementsBefore + n;
				array[currentIndex] = value;
			}
		}

		return array;
	}

	public int getIndex(int[] array, int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				return i;
			}
		}

		return -1;
	}

	public int getSum(int[] array, int end) {
		int sum = 0;
		for (int i = 0; i < end; i++) {
			sum += array[i];
		}
		return sum;
	}
}
