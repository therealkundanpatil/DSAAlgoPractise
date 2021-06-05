package arrays.problem_five_Move_Element_to_End;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
		// Write your code here.
		int fixedLength = array.size();

		int[] data = new int[fixedLength];
		for (int i = 0; i < array.size(); i++) {
			data[i] = array.get(i);
		}

		for (int i = 0, j = fixedLength - 1; i < j;) {
			if (data[i] != toMove && data[j] != toMove) {
				i++;
			} else if (data[j] == toMove) {
				j--;
			} else if (data[i] == toMove && data[j] != toMove) {
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;

				i++;
				j--;
			}

		}

		List<Integer> toReturn = new ArrayList<>();

		for (int i = 0; i < fixedLength; i++) {
			toReturn.add(data[i]);
		}

		return toReturn;
	}

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		array.add(2);
		array.add(1);
		array.add(2);
		array.add(2);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(2);

		int toMove = 2;

		System.out.println(moveElementToEnd(array, toMove));
	}

}
