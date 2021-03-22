package searching.problem_one_Binary_Search;

/**
 * Binary Search Algorithm
 * 
 * Time Complexity : O(Log(N))
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class Solution_2 {
	public static int binarySearch(int[] array, int target) {
		// Write your code here.
		int left = 0;
		int right = array.length - 1;
		return binarySearch(array, target, left, right);
	}

	private static int binarySearch(int[] array, int target, int left, int right) {
		if (left > right) {
			return -1;
		}

		int middle = left + (right - left) / 2;
		int data = array[middle];

		if (data == target) {
			return middle;
		} else if (data < target) {
			return binarySearch(array, target, middle + 1, right);
		} else {
			return binarySearch(array, target, left, middle - 1);
		}
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
