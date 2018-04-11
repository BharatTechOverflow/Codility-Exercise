/**
 * 
 */
package com.codility.lession6;

import java.util.Arrays;

/**
 * @author s727953
 *
 */
public class MaxProductOfThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { -3, 1, 2, -2, 5, 6 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {

		final int arrLen = A.length;
		if (arrLen == 3) {
			return A[0] * A[1] * A[2];
		}

		Arrays.sort(A);

		final int trailing = A[arrLen - 1] * A[arrLen - 2] * A[arrLen - 3];
		final int leading = A[arrLen - 1] * A[0] * A[1];

		return Math.max(trailing, leading);
	}

}
