package famous_algorithms.problem_one_Kadane_Algorithm;

public class Solution_2 {
	public static int kadanesAlgorithm(int[] array) {
		// Write your code here.
		int maximumSum = array[0];
		int currentSum = array[0];

		for (int i = 1; i < array.length; i++) {
			currentSum = Math.max(currentSum + array[i], array[i]);
			maximumSum = Math.max(currentSum, maximumSum);
		}

		return maximumSum;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(kadanesAlgorithm(array));
	}
}
