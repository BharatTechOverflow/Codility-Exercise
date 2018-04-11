/**
 * 
 */
/**
 * @author s727953
 *
 */
package com.codility.lesson16;

public class MaxNonOverlappingSegments {
	public static void main(String[] args) {

		int[] A = { 1, 3, 7, 9, 9 };
		int[] B = { 5, 6, 8, 9, 10 };
		System.out.println(solution(A, B));

	}

	static int solution(int A[], int B[]) {

		int segments = 1;
		int prev_end = B[0];
		int curr;

		for (curr = 1; curr < A.length; curr++) {

			if (A[curr] > prev_end) {
				segments++;
				prev_end = B[curr];
			}
		}

		return segments;
	}

}