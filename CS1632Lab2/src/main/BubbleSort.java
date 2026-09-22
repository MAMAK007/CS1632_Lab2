package main;

public class BubbleSort {

	public static void sort(int[] mySortedArray) {
		int arraySize = mySortedArray.length;
		for (int i = 0; i < arraySize - 1; i++) {
		    for (int j = 0; j < arraySize - 1 - i; j++) {
		        // Swap if the current element is greater than the next element
		        if (mySortedArray[j] > mySortedArray[j + 1]) {
		            int temp = mySortedArray[j];
		            mySortedArray[j] = mySortedArray[j + 1];
		            mySortedArray[j + 1] = temp;
		        }
		    }
		}
	}
}
