/**
 * 
 */
package com.sorting;

import static java.lang.System.out;

/**
 * @author s727953
 *
 */
public class BubbleSortImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, -1, 3, -5 };
		bubbleSort(input);

	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				int l = j + 1;
				if (arr[j] > arr[l]) {
					swiping(j, l, arr);
				}
			}
		}
		printNumbers(arr);
	}

	public static void swiping(int i, int j, int[] arr) {
		out.println(i + " --- " + arr[i] + "  J " + j + " --- " + arr[j]);
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printNumbers(int[] input) {

		for (int i = 0; i < input.length; i++) {
			out.print(input[i] + ", ");
		}
		out.println("\n");
	}

}
