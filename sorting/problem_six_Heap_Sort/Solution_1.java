package sorting.problem_six_Heap_Sort;

/**
 * Heap Sort Algorithm
 * 
 * Time Complexity : O(N*log(N))
 * 
 * Space Complexity :O(log(N))
 * 
 * @author Kundan
 *
 */
public class Solution_1 {
	public static int[] heapSort(int[] array) {
		// Write your code here.
		buildMaxHeap(array);
		for (int endIndex = array.length - 1; endIndex > 0; endIndex--) {
			swap(array, 0, endIndex);
			siftDown(array, 0, endIndex - 1);
		}
		return array;
	}

	private static void buildMaxHeap(int[] array) {
		int firstParentIndex = (array.length - 2) / 2;
		for (int currentIndex = firstParentIndex; currentIndex >= 0; currentIndex--) {
			siftDown(array, currentIndex, array.length - 1);
		}
	}

	private static void siftDown(int[] heap, int currentIndex, int endIndex) {
		int childOneIndex = 2 * currentIndex + 1;
		while (childOneIndex <= endIndex) {
			int childTwoIndex = 2 * currentIndex + 2 <= endIndex ? 2 * currentIndex + 2 : -1;
			int indexToSwap;
			if (childTwoIndex != -1 && heap[childTwoIndex] > heap[childOneIndex]) {
				indexToSwap = childTwoIndex;
			} else {
				indexToSwap = childOneIndex;
			}
			if (heap[indexToSwap] > heap[currentIndex]) {
				swap(heap, currentIndex, indexToSwap);
				currentIndex = indexToSwap;
				childOneIndex = 2 * currentIndex + 1;
			} else {
				return;
			}
		}
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
