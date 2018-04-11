/**
 * 
 */
package com.codility.lesson9;

/**
 * @author s727953
 *
 */
public class MaxSliceSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 3, 2, -6, 4, 0 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		int maxSliceSumEnd = A[0];
		int maxSliceFar = A[0];

		for (int i = 1; i < A.length; i++) {
			maxSliceSumEnd = Math.max(A[i], maxSliceSumEnd + A[i]);
			maxSliceFar = Math.max(maxSliceFar, maxSliceSumEnd);
		}

		return maxSliceFar;
	}
}
