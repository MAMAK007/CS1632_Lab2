package main;

public class MergeSort {
	// Main recursive function that splits the array
	public static void sort(int[] array, int left, int right) {
	    if (left < right) {
	        // Find the middle point
	        int mid = left + (right - left) / 2;

	        // Sort first and second halves recursively
	        sort(array, left, mid);
	        sort(array, mid + 1, right);

	        // Merge the sorted halves
	        merge(array, left, mid, right);
	    }
	}

	// Helper method to merge two sorted subarrays: array[left..mid] and array[mid+1..right]
	private static void merge(int[] array, int left, int mid, int right) {
	    // Sizes of two subarrays to be merged
	    int n1 = mid - left + 1;
	    int n2 = right - mid;

	    // Create temporary arrays
	    int[] leftArray = new int[n1];
	    int[] rightArray = new int[n2];

	    // Copy data to temporary arrays
	    System.arraycopy(array, left, leftArray, 0, n1);
	    System.arraycopy(array, mid + 1, rightArray, 0, n2);

	    // Initial indices of first and second subarrays
	    int i = 0, j = 0;

	    // Initial index of merged subarray
	    int k = left;
	    while (i < n1 && j < n2) {
	        if (leftArray[i] <= rightArray[j]) {
	            array[k] = leftArray[i];
	            i++;
	        } else {
	            array[k] = rightArray[j];
	            j++;
	        }
	        k++;
	    }

	    // Copy remaining elements of leftArray[], if any
	    while (i < n1) {
	        array[k] = leftArray[i];
	        i++;
	        k++;
	    }

	    // Copy remaining elements of rightArray[], if any
	    while (j < n2) {
	        array[k] = rightArray[j];
	        j++;
	        k++;
	    }
	}
}
