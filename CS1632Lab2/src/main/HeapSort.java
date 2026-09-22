package main;

public class HeapSort {

	// Main function that performs Heap Sort
	public static void sort(int[] array) {
	    int n = array.length;

	    // Build max heap (rearrange array)
	    for (int i = n / 2 - 1; i >= 0; i--) {
	        heapify(array, n, i);
	    }

	    // One by one extract elements from heap
	    for (int i = n - 1; i > 0; i--) {
	        // Move current root (largest element) to end
	        int temp = array[0];
	        array[0] = array[i];
	        array[i] = temp;

	        // Call max heapify on the reduced heap
	        heapify(array, i, 0);
	    }
	}

	// To heapify a subtree rooted with node i, which is an index in array[]. n is size of heap.
	private static void heapify(int[] array, int n, int i) {
	    int largest = i;       // Initialize largest as root
	    int left = 2 * i + 1;  // left child = 2*i + 1
	    int right = 2 * i + 2; // right child = 2*i + 2

	    // If left child is larger than root
	    if (left < n && array[left] > array[largest]) {
	        largest = left;
	    }

	    // If right child is larger than largest so far
	    if (right < n && array[right] > array[largest]) {
	        largest = right;
	    }

	    // If largest is not root
	    if (largest != i) {
	        int swap = array[i];
	        array[i] = array[largest];
	        array[largest] = swap;

	        // Recursively heapify the affected sub-tree
	        heapify(array, n, largest);
	    }
	}
	
}
