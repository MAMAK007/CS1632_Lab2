package main;

public class SelectionSort {

	public static void sort(int[] mySortedArray) {
		int arraySize = mySortedArray.length;
		for (int i = 0; i < arraySize - 1; i++) {
		    int minIndex = i; // Assume the current position holds the smallest value
		    
		    // Find the index of the smallest element in the unsorted portion
		    for (int j = i + 1; j < arraySize; j++) {
		        if (mySortedArray[j] < mySortedArray[minIndex]) {
		            minIndex = j; // Found a smaller element, record its index
		        }
		    }
		    
		    // Swap the found minimum element with the element at position i
		    if (minIndex != i) {
		        int temp = mySortedArray[i];
		        mySortedArray[i] = mySortedArray[minIndex];
		        mySortedArray[minIndex] = temp;
		    }
		}
	}
}
