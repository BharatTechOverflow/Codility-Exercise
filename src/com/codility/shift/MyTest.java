package com.codility.shift;

import java.util.Arrays;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
	// public int solution(int[] A) {
	// int arr_size = A.length;
	// int missing = findMissing(A, arr_size);
	// return missing;
	// }

	public static void main(String[] args) {
		int[] A = { 1, 3, 6, 4, 1, 2 };
		int arr_size = A.length;
		int missing = findMissing(A, arr_size);
		System.out.println("Missing " + missing);
	}

	private static int findMissing(int[] arr1, int arr_size) {
		Arrays.sort(arr1);

		// Count Negative Integer in array
		int negIntIndx = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < 0) {
				negIntIndx++;
			}
		}

		int[] posArr = new int[arr_size - negIntIndx];
		int k = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > 0) {
				posArr[k] = arr1[i];
				k++;
			}
		}

		if (posArr.length <= 0) { // If array has only negative Integer
			return 1;
		}

		for (int j = 0; j < posArr.length; j++) {
			if (j + 1 != posArr[j]) {
				return j + 1;
			} else if ((posArr.length) == j + 1) {
				return j + 1 + 1;
			}
		}

		return 0;

	}
}