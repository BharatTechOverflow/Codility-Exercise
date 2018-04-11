/**
 * 
 */
package com.codility.lesson9;

/**
 * @author s727953
 *
 */
public class PaxProfit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 23171, 21011, 21123, 21366, 21013, 21367 };
		System.out.println(solution(A));

	}

	public static int solution(int[] a) {
		if (a.length <= 1)
			return 0;

		int minBuyingPrice = a[0];
		int maxProfitSoFar = 0;
		
		for (int i = 1; i < a.length; i++) {
			maxProfitSoFar = Math.max(maxProfitSoFar, a[i] - minBuyingPrice);
			minBuyingPrice = Math.min(minBuyingPrice, a[i]);
		}
		return maxProfitSoFar;
	}
}
