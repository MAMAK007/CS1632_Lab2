package main;

public class QuickSort {

	// Main recursive Quick Sort method
	public static void sort(int[] array, int low, int high) {
	    if (low < high) {
	        // partitionIndex is the index where the pivot is now at its correct position
	        int partitionIndex = partition(array, low, high);

	        // Recursively sort elements before and after partition
	        sort(array, low, partitionIndex - 1);
	        sort(array, partitionIndex + 1, high);
	    }
	}

	// Helper method to partition the array around a pivot element
	private static int partition(int[] array, int low, int high) {
	    // Select the last element as the pivot
	    int pivot = array[high];
	    
	    // Index of smaller element, indicating the rightmost position of elements <= pivot
	    int i = low - 1;

	    for (int j = low; j < high; j++) {
	        // If current element is smaller than or equal to pivot
	        if (array[j] <= pivot) {
	            i++;
	            // Swap array[i] and array[j]
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }

	    // Swap the pivot element (array[high]) with array[i + 1] to place it in position
	    int temp = array[i + 1];
	    array[i + 1] = array[high];
	    array[high] = temp;

	    return i + 1; // Return the index of the pivot
	}
}
