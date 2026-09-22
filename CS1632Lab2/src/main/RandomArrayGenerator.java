package main;

import java.util.Random;
import java.util.Arrays;

public class RandomArrayGenerator {

	public int[] generateRandomArray(int size) {
		Random random = new Random();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = random.nextInt(); // Generates random integers
		}
	return array;
	}
	
//	public static void main(String[] args) {
//		int arraySize = 1000000; // Adjust as needed
//		int[] randomArray = generateRandomArray(arraySize);
//		// Print the first 10 elements for demonstration
//		System.out.println("First 10 elements:");
//		System.out.println(Arrays.toString(Arrays.copyOfRange(randomArray, 0, 10)));
//	}
}