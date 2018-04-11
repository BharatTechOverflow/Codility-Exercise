/**
 * 
 */
package com.codlility.lesson92;

import java.util.Arrays;

/**
 * @author s727953
 *
 */
public class SocksLaundering {

	public static void main(String[] args) {
		int K = 2;
		int[] C = { 1, 2, 1, 1 }, D = { 1, 4, 3, 2, 4 };

		// System.out.println(findCounts(C, C.length));

		System.out.println(solution(K, C, C.length, D, D.length));
	}

	static int solution(int K, int C[], int N, int D[], int M) {
		System.out.println(" DDDDDDDDDDDDD ");
		// Collections.
		Arrays.sort(C);

		int pairCount = 0;
		int freq = 0;
		// total washing machine capicity
		System.out.println(K);

		for (int i = 0; i < C.length; i++) {
			int index = i + (freq > 0 ? freq - 1 : freq);
			if (index >= C.length) {
				break;
			}
			System.out.println(index + " Index ");
			int num = C[index];
			freq = 0;
			freq++;

			for (int j2 = index; j2 < C.length; j2++) {
				int xNum = C[j2];
				if (num == xNum) {
					freq++;
				}
				if (j2 == C.length - 1) {

				}
			}
			System.out.println("Num " + num + " Feq " + freq);

		}

		return -1;
	}

	static int findCounts(int arr[], int n) {
		// Traverse all array elements
		int i = 0;
		while (i < n) {
			// If this element is already processed,
			// then nothing to do
			if (arr[i] <= 0) {
				i++;
				continue;
			}

			// Find index corresponding to this element
			// For example, index for 5 is 4
			int elementIndex = arr[i] - 1;

			// If the elementIndex has an element that is not
			// processed yet, then first store that element
			// to arr[i] so that we don't loose anything.
			if (arr[elementIndex] > 0) {
				arr[i] = arr[elementIndex];

				// After storing arr[elementIndex], change it
				// to store initial count of 'arr[i]'
				arr[elementIndex] = -1;
			} else {
				// If this is NOT first occurrence of arr[i],
				// then increment its count.
				arr[elementIndex]--;

				// And initialize arr[i] as 0 means the element
				// 'i+1' is not seen so far
				arr[i] = 0;
				i++;
			}
		}

		System.out.println("Below are counts of all elements");
		for (int j = 0; j < n; j++)
			System.out.println(j + 1 + "->" + Math.abs(arr[j]));
		return i;
	}

}
