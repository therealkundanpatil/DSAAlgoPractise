package searching.problem_one_Binary_Search;

/**
 * Binary Search Algorithm
 * 
 * Time Complexity : O(log(N))
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class Solution_1 {
	public static int binarySearch(int[] array, int target) {
		return binarySearch(array, target, 0, array.length - 1);
	}

	private static int binarySearch(int[] array, int target, int left, int right) {
		while (left <= right) {
			int middle = left + (right - left) / 2;
			int data = array[middle];

			if (data == target) {
				return middle;
			} else if (data < target) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int index = binarySearch(a, 5);
		if (index != -1) {
			System.out.println("Element found at index : " + index);
		} else {
			System.out.println("Element not found");
		}
	}
}
