package arrays.problem_ten_First_Duplicate_Value;

import java.util.HashSet;
import java.util.Set;

public class Solution_2 {
	public static int firstDuplicateValue(int[] array) {
		// Write your code here.
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (set.contains(array[i])) {
				return array[i];
			}
			set.add(array[i]);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 2, 1, 5, 2, 3, 3, 4 };
		System.out.println(firstDuplicateValue(array));
	}
}
