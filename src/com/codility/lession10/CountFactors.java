/**
 * 
 */
package com.codility.lession10;

/**
 * @author s727953
 *
 */
public class CountFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(solution(36));
	}

	public static int solution(int N) {

		int j = 1;
		int divisorCount = 0;
		for (j = 1; j < Math.sqrt(N); j++) {
			if (N % j == 0) {
				divisorCount += 2;
			} 
		}
		if (Math.pow(j, 2) == N) {
			divisorCount += 1;
		}
		return divisorCount;
	}

}
