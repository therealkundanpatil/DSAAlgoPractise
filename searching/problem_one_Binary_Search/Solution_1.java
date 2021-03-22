package searching.problem_one_Binary_Search;

public class Solution_1 {
	public static int binarySearch(int[] array, int target) {
		// Write your code here.
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int middle = left + (right - left) / 2;
			if (array[middle] == target) {
				return middle;
			} else if (array[middle] < target) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}
		return -1;
	}
}
