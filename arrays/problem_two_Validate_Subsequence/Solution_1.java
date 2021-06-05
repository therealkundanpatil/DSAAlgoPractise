package arrays.problem_two_Validate_Subsequence;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		// Write your code here.
		int maxTraversalLength = array.size();
		int sequenceTraversalLimit = sequence.size();
		for (int i = 0, j = 0; i < maxTraversalLength; i++) {
			int currentElement = array.get(i);
			int elementToLookFor = sequence.get(j);
			if (currentElement == elementToLookFor) {
				j++;
			}
			if (j == sequenceTraversalLimit) {
				return true;
			}
		}

		return false;
	}
	
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		List<Integer> sequence = new ArrayList<>();
		
		array.add(5);
		array.add(1);
		array.add(22);
		array.add(25);
		array.add(6);
		array.add(-1);
		array.add(8);
		array.add(10);
		
		sequence.add(1);
		sequence.add(6);
		sequence.add(-1);
		sequence.add(10);
		
		
		System.out.println(isValidSubsequence(array, sequence));
	}
}
