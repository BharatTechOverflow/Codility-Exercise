/**
 * 
 */
/**
 * @author s727953
 *
 */
package com.codility.lession5;

public class CountDiv {

	public static void main(String[] args) {

		int A = 6, B = 11, K = 2;
		System.err.println(solution(A, B, K));
	}

	public static int solution(int A, int B, int K) {
		int count = 0;
//		if (A >= B) {
//			return 0;
//		}
//		if (K >= B) {
//			return 0;
//		}

		int firstDivide = A / K;
		int secondDivide = B / K;
		count = secondDivide - firstDivide;

		if (A % K == 0)
			count++;

		return count;

	}
}