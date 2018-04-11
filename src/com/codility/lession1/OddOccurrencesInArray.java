package com.codility.lession1;

public class OddOccurrencesInArray {

	// A is non-empty
	// N is odd
	// It contains pairs, need to return value of unpaired element

	public static void main(String[] args) {
		System.out.println("------- " + solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));

	}

	// Bharat
	public static int solutinBharat(int[] A) {

		for (int i = 0; i < A.length; i++) {
			int count = 0;
			for (int j = 0; j < A.length; j++) {
				if (A[i] == A[j]) {
					count++;

				}
			}
			if (count % 2 != 0)
				return A[i];
		}
		return 0;

	}

	// Time: O(N)
	// Space: O(1)
	public static int solution(int[] A) {
		// write your code in Java SE 8
		int elem = 0;

		for (int i = 0; i < A.length; i++) {
			System.out.println(elem + " " + A[i]);
			elem = elem ^ A[i];
		}
		return elem;
	}
}
