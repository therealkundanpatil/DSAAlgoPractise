package arrays.problem_twenty_Sorted_Squared_Array;

import java.util.Arrays;

public class Solution_1 {
	public static int[] sortedSquaredArray(int[] array) {
		// Write your code here.
		int length = array.length;

		for (int i = 0, j = 0; i < length; i++, j++) {
			array[j] = (array[i] * array[i]);
		}

		Arrays.sort(array);
		
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {-10, -5, 0, 5, 10};
		System.out.println(Arrays.toString(sortedSquaredArray(array)));

	}

}
