/**
 * 
 */
package com.codility.lesson14;

/**
 * @author s727953
 *
 */
public class MinMaxDivision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 2, 1, 5, 1, 2, 2, 2 };
		int K = 3, M = 5;
		System.out.println(solution(K, M, A));
	}

	public static int solution(int K, int M, int[] A) {
		// Using the Binary Search Algorithm to solve this problem

		int min = 0;
		int maxLargSum = 0;
		// Calculate the sum of all the element as maxLargSum, and the get
		// largest
		// number as min
		for (int i : A) {
			maxLargSum += i;
			min = Math.max(min, i);

		}

		int maxSumResult = 0;

		while (min <= maxLargSum) {
			int middle = (min + maxLargSum) / 2;
			System.out.println(middle);
			int count = 0;
			long sum = 0;
			for (int elem : A) {
				sum += elem;
				
				if (elem > middle) {

					count = K + 1;
					break;
				}
				if (sum > middle) {
					count++;
					sum = elem;
				}
			}

			count++;
			if (count <= K) {
				maxLargSum = middle - 1;
				maxSumResult = middle;

			} else {
				min = middle + 1;
			}
		}
		return (int) maxSumResult;

	}

}
