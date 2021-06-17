package arrays.problem_ten_First_Duplicate_Value;

public class Solution_3 {
	public static int firstDuplicateValue(int[] array) {
		// Write your code here.
		for (int i = 0; i < array.length; i++) {
			int value = Math.abs(array[i]);
			if (array[value - 1] < 0) {
				return value;
			}
			array[value - 1] *= -1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array = { 2, 1, 5, 2, 3, 3, 4 };
		System.out.println(firstDuplicateValue(array));
	}
}
