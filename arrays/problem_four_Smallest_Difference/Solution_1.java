package arrays.problem_four_Smallest_Difference;

import java.util.Arrays;

public class Solution_1 {
	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		// Write your code here.
		int minimumDifference = Integer.MAX_VALUE;

		int number1 = arrayOne[0];
		int number2 = arrayTwo[0];

		for (int i = 0; i < arrayOne.length; i++) {
			for (int j = 0; j < arrayTwo.length; j++) {
				int difference = Math.abs(arrayOne[i] - arrayTwo[j]);
				if (minimumDifference > difference) {
					minimumDifference = difference;
					number1 = arrayOne[i];
					number2 = arrayTwo[j];
				}
			}
		}

		return new int[] { number1, number2 };
	}
	
	public static void main(String[] args) {
		int[] arrayOne = {-1,5,10,20,28,3};
		int[] arrayTwo = {26,134,135,15,17};
		System.out.println(Arrays.toString(smallestDifference(arrayOne, arrayTwo)));
	}
	
}
