/**
 * 
 */
/**
 * @author s727953
 *
 */
package com.codility.lesson9;

public class MaxDoubleSliceSum {

	public static void main(String[] args) {

		int[] A = { 3, 2, 6, -1, 4, 5, -1, 2 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {
		// Kadane’s algorithm
		int arrLen = A.length;
		int[] forwardSum = new int[arrLen];
		int[] reverseSum = new int[arrLen];

		for (int i = 1; i < arrLen - 1; i++) {
			forwardSum[i] = Math.max(forwardSum[i - 1] + A[i], 0);
		}

		for (int i = arrLen - 2; i > 0; i--) {
			reverseSum[i] = Math.max(reverseSum[i + 1] + A[i], 0);
		}

		int maxSum = 0;

		for (int i = 1; i < arrLen - 1; i++) {

			maxSum = Math.max(maxSum, forwardSum[i - 1] + reverseSum[i + 1]); 
		}

		return maxSum;
	}
}