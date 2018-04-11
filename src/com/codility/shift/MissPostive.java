package com.codility.shift;

public class MissPostive {
	public static void main(String[] args) {
		System.out.println("Missing Positive Integer!");

		int[] arr = { -1,-2 };
		int arrLen = arr.length;
		int missingNumber = findMissing(arr, arrLen);
		System.out.println(" <<>>>>  " + missingNumber);

	}

	static int findMissing(int[] arr, int size) {
		// First separate Positive and Negative Number
		int shift = segregate(arr, size);
		System.out.println(shift);

		int arr2[] = new int[size - shift];
		int j = 0;
		for (int i = shift; i < size; i++) {
			arr2[j] = arr[i];
			System.out.println(arr2[j]);
			j++;

		}
		// Shift the array and call findMissingPositive for positive part
		return findMissingPositive(arr2, j);
	}

	static int findMissingPositive(int arr[], int size) {
		System.out.println("Sorted Array size " + size);
		int i = 0;
		for (i = 0; i < size; i++) {
			if (Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)

				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];

		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(">>>   " + arr[j]);

		}

		// Return the first index value at which
		// is positive
		for (i = 0; i < size; i++)
			if (arr[i] > 0)
				return i + 1; // 1 is added becuase indexes
								// start from 0

		return size;
	}

	static int segregate(int[] arr, int arrLen) {
		int j = 0;

		for (int i = 0; i < arrLen; i++) {
			if (arr[i] <= 0) {
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;

			}

		}
		return j;
	}
}
