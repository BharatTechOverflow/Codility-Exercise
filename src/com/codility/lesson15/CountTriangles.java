/**
 * 
 */
package com.codility.lesson15;

import java.util.Arrays;

/**
 * @author s727953
 *
 */
public class CountTriangles {

	public static void main(String[] args) {
		int[] A = { 10, 2, 5, 1, 8, 12 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {
		Arrays.sort(A);
		int triangleCount = 0, arrLen = A.length;
		// first element
		for (int p = 0; p < arrLen - 2; p++) {
			// position of R
			int R = p + 2;

			for (int Q = p + 1; Q < arrLen- 1; Q++) {
				// Get third value of
				while (R < arrLen && A[p] + A[Q] > A[R]) {
					R += 1;
				}

				triangleCount += R - Q - 1;
			}
		}
		return triangleCount;
	}
}
