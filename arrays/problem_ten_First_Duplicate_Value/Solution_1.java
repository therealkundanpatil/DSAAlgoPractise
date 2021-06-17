package arrays.problem_ten_First_Duplicate_Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_1 {
	
	public static int firstDuplicateValue(int[] array) {
		// Write your code here.
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (!map.containsKey(array[i])) {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(array[i], list);
			} else {
				List<Integer> list = map.get(array[i]);
				list.add(i);
				map.put(array[i], list);
			}
		}

		int minimumIndex = Integer.MAX_VALUE;
		int currentIndex = Integer.MAX_VALUE;
		int toReturn = -1;
		for (Map.Entry<Integer, List<Integer>> mapEntry : map.entrySet()) {
			int key = mapEntry.getKey();
			List<Integer> list = mapEntry.getValue();
			if (list.size() > 1) {
				currentIndex = list.get(1);
				if (currentIndex < minimumIndex) {
					minimumIndex = currentIndex;
					toReturn = key;
				}
			} else {
				continue;
			}
		}
		return toReturn;
	}
	
	public static void main(String[] args) {
		int[] array = {2, 1, 5, 2, 3, 3, 4};
		System.out.println(firstDuplicateValue(array));
	}
}
