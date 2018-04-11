package com.codility.lession10;
/**
 * 
 */

/**
 * @author s727953
 *
 */
public class MinPerimeterRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(solution(30));
	}

	public static int solution(int N) {
		int A = 0;
		int B = 0;
		int minPeriMeter = Integer.MAX_VALUE;
		final int sqrtN = (int) Math.sqrt(N);

		for (int i = 1; i <= sqrtN; i++) {

			if (N % i == 0) {

				A = i;
				B = N / i;
				minPeriMeter = Math.min(minPeriMeter, 2 * (A + B));

			}
		}
		return minPeriMeter;
	}
}
