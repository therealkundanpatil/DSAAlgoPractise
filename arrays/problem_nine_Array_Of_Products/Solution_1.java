package arrays.problem_nine_Array_Of_Products;

import java.util.Arrays;

public class Solution_1 {
	public static int[] arrayOfProducts(int[] array) {
		// Write your code here.
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int answer = 1;
			for (int j = 0; j < array.length; j++) {
				if (i == j) {
					continue;
				} else {
					answer *= array[j];
				}
			}
			result[i] = answer;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] array = {5,1,4,2};
		System.out.println(Arrays.toString(arrayOfProducts(array)));
	}
}
