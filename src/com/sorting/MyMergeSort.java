/**
 * 
 */
package com.sorting;

import static java.lang.System.out;

/**
 * @author s727953
 *
 */
public class MyMergeSort {

	private int[] numbers;
	private int[] helper;
	private int number;

	public static void main(String[] args) {

		int[] inputArr = { 45, 23, 11, 89};
		MyMergeSort mms = new MyMergeSort();
		mms.margeSort(inputArr);
		mms.printNumbers(inputArr);
	}

	private void margeSort(int[] values) {
		this.numbers = values;
		number = values.length;
		this.helper = new int[number];
		mergesort(0, number - 1);
	}

	private void mergesort(int lowerIdx, int higherIdx) {
		System.err.println(" lowerIdx  " + lowerIdx + " higherIdx  " + higherIdx);
		// check if low is smaller than high, if not then the array is sorted
		if (lowerIdx < higherIdx) {
			// Get the index of the element which is in the middle
			int middleIdx = lowerIdx + (higherIdx - lowerIdx) / 2;
			System.out.println(" lowerIdx  " + lowerIdx + " middleIdx  " + middleIdx + " higherIdx  " + higherIdx);

			// Sort the left side of the array
			mergesort(lowerIdx, middleIdx);
			// Sort the right side of the array
			mergesort(middleIdx + 1, higherIdx);
			// Combine them both
			merge(lowerIdx, middleIdx, higherIdx);
		}
	}

	private void merge(int low, int middle, int high) {

		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}
		// Since we are sorting in-place any leftover elements from the right side
		// are already at the right position.

	}

	private static void printNumbers(int[] input) {

		for (int i = 0; i < input.length; i++) {
			out.print(input[i] + ", ");
		}
		out.println("\n");
	}
}