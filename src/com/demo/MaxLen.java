package com.demo;

import java.util.Arrays;

public class MaxLen {
	public static void main(String[] args) {
		int[] A = { 1, 4, 7, 3, 3, 5 };
//		int[] B = { 1, 4, 7, 3, 3, -15 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int maxDistance = -1;
		final int arrLen = A.length;
		System.out.println(arrLen);
		System.out.println(arrLen * Math.log(arrLen));

		int[] B = new int[arrLen];
		for (int i = 0; i < A.length; i++) {
			B[i] = Math.abs(A[i]);

		}

		Arrays.sort(B);
		for (int P = 0; P < arrLen; P++) {
			System.out.println("P " + P + "  P[] " + B[P]);
			if (P != arrLen - 1) {
				int tempP = Math.abs(B[P]);
				int tempQ = Math.abs(B[P + 1]);

				if (tempP != tempQ) {
					int tempDistance = Math.abs(tempP - tempQ);
					maxDistance = Math.max(maxDistance, tempDistance);

				}
			}
		}

		return maxDistance;
	}
}