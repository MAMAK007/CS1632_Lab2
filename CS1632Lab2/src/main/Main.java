package main;

import java.util.Scanner;

public class Main {
		
	public static void main() {
		Scanner sc = new Scanner(System.in);
		RandomArrayGenerator rag = new RandomArrayGenerator();
		Timer timer = new Timer();
		
		int arraySize;
		int sortMethod;
		int reviewMethod;
		
		System.out.println("-- Random Integer Sorter --\n\n");
		
		while (true) {
			System.out.print("How many integers do you want to sort?\n> ");
			
			try {
				arraySize = sc.nextInt();
				if (arraySize > 0) {
					break;
				} else {
					System.out.println("Size must be greater than 0!");
					sc.nextLine();
				}
			} catch (Exception e) {
				System.out.println("Not a valid integer!");
				sc.nextLine();
			}
		}
		
		// Create random array
		int[] myArray = rag.generateRandomArray(arraySize);
		
		// Create an array to copy the random array to for sorting
		// (so we can show a comparison later between original and sorted)
		int[] mySortedArray = new int[arraySize];
		System.arraycopy(myArray, 0, mySortedArray, 0, arraySize);
		
		while (true) {
			System.out.println("(1: Bubble | 2: Selection | 3: Merge | 4: Heap | 5: Quick");
			System.out.print("What kind of sort do you want to do?\n> ");
			
			try {
				sortMethod = sc.nextInt();
				if (sortMethod > 0 && sortMethod < 6) {
					break;
				} else {
					System.out.println("Invalid selection!");
					sc.nextLine();
				}
			} catch (Exception e) {
				System.out.println("Invalid selection!");
				sc.nextLine();
			}
		}
		
		// Perform Bubble Sort on mySortedArray (smallest to largest)
		if (sortMethod == 1) {
			timer.reset();
			
			System.out.println("STARTING SORT...");
			timer.start();
			BubbleSort.sort(mySortedArray);
			timer.stop();
			System.out.println("SORTING COMPLETE!");
			
			System.out.println("Time elapsed: " + timer.getElapsedMilliseconds());
		
		// Perform Selection Sort on mySortedArray (smallest to largest)	
		} else if (sortMethod == 2) {
			timer.reset();
			
			System.out.println("STARTING SORT...");
			timer.start();
			SelectionSort.sort(mySortedArray);
			timer.stop();
			System.out.println("SORTING COMPLETE!");
			
			System.out.println("Time elapsed: " + timer.getElapsedMilliseconds());
			
		// Perform Merge Sort on mySortedArray (smallest to largest)
		} else if (sortMethod == 3) {
			timer.reset();
			
			System.out.println("STARTING SORT...");
			timer.start();
			MergeSort.sort(mySortedArray, 0, arraySize - 1);
			timer.stop();
			System.out.println("SORTING COMPLETE!");
			
			System.out.println("Time elapsed: " + timer.getElapsedMilliseconds());
		
		// Perform Heap Sort on mySortedArray (smallest to largest)	
		} else if (sortMethod == 4) {
			timer.reset();
			
			System.out.println("STARTING SORT...");
			timer.start();
			HeapSort.sort(mySortedArray);
			timer.stop();
			System.out.println("SORTING COMPLETE!");
			
			System.out.println("Time elapsed: " + timer.getElapsedMilliseconds());
		
		// Perform Quick Sort on mySortedArray (smallest to largest)	
		} else if (sortMethod == 5) {
			timer.reset();
			
			System.out.println("STARTING SORT...");
			timer.start();
			QuickSort.sort(mySortedArray, 0, arraySize - 1);
			timer.stop();
			System.out.println("SORTING COMPLETE!");
			
			System.out.println("Time elapsed: " + timer.getElapsedMilliseconds());
		
		// If they somehow find a way to input an invalid selection ¯\_(ツ)_/¯
		} else {
			System.out.println("Invalid selection!");
		}
		
		while (true) {
			System.out.println("1: VIEW ORIGINAL ARRAY | 2: VIEW SORTED ARRAY | 3: START OVER | 4: QUIT");
			System.out.print("What do you want to do?\n> ");
			
			while (true) {
				try {
					reviewMethod = sc.nextInt();
					if (reviewMethod > 0 && reviewMethod < 5) {
						break;
					} else {
						System.out.println("Invalid selection!");
						sc.nextLine();
					}
				} catch (Exception e) {
					System.out.println("Invalid selection!");
					sc.nextLine();
				}
			}
			
			if (reviewMethod == 1) {
				System.out.println("\n-- ORIGINAL ARRAY --");
				System.out.println(myArray);
			} else if (reviewMethod == 2) {
				System.out.println("\n-- SORTED ARRAY --");
				System.out.println(mySortedArray);
			} else if (reviewMethod == 3) {
				main();
				break;
			} else if (reviewMethod == 4) {
				System.out.println("Quitting program...");
				sc.close();
				break;
			} else {
				System.out.println("Invalid selection!");
				sc.nextLine();
			}
		}
	}
}
