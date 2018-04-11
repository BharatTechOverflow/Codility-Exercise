/**
 * 
 */
/**
 * @author s727953
 *
 */
package com.codility.lesson14;

public class BinarySearch {
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int len = arr.length;
		int X = 4;
		int result = bs.binarySearch(arr, 0, len - 1, X);
		if (result == -1) {
			System.out.println("Element not present!");
		} else {
			System.out.println("Element found at index  " + result);
		}

	}

	int binarySearch(int arr[], int left, int right, int x) {
		if (right > left) {
			System.out.println(right);
			int middle = left + (right - left) / 2;
			// if the element is present in middle
			if (arr[middle] == x) {
				return middle;
			}

			// If element is smaller than mid, then it can only be present in
			// left subarray
			if (arr[middle] > x) {
				return binarySearch(arr, left, middle + 1, x);
			}
			// Else the element can only be present in right
			// subarray
			return binarySearch(arr, middle + 1, right, x);

		}

		// We reach here when element is not present in array

		return -1;
	}
}