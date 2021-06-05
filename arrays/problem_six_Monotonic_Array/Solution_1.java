package arrays.problem_six_Monotonic_Array;

public class Solution_1 {
	public static boolean isMonotonic(int[] array) {
		// Write your code here.
		if (array.length == 0) {
			return true;
		} else if (array.length == 1) {
			return true;
		} else {
			boolean isMonotonicallyIncreasing = true;
			boolean isMonotonicallyDecresing = true;

			// check monotonically increasing
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i + 1]) {
					isMonotonicallyIncreasing = false;
					break;
				}
			}

			// check monotonically decreasing
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					isMonotonicallyDecresing = false;
					break;
				}
			}

			if (isMonotonicallyIncreasing || isMonotonicallyDecresing) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array = { -1, -5, -10, -1100, -1100, -1101, -1102, -9001 };
		System.out.println(isMonotonic(array));
	}
}
