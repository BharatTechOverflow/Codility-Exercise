/**
 * 
 */
package com.codility.lession6;

import java.util.Arrays;

/**
 * @author s727953
 *
 */
public class TriangleEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 10, 2, 5, 1, 8, 20 };
		System.out.println(solution(A));

		int[] B = { 10, 50, 5, 1 };
		System.out.println(solution(B));
	}

	public static int solution(int[] A) {
		final int arrlen = A.length;

		if (null == A || arrlen < 3)
			return 0;
		Arrays.sort(A);

		for (int i = 0; i < arrlen - 2; i++) {
			if (A[i] > 0 && A[i] + A[i + 1] > A[i + 2]) {
				return 1;
			}

		}
		return 0;
	}
}
