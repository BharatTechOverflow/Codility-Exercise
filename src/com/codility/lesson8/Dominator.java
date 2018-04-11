/**
 * 
 */
package com.codility.lesson8;

/**
 * @author s727953
 *
 */
public class Dominator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 3, 4, 3, 2, 3, -1, 3, 3 };
		System.out.println(solution(A));
	}

	public static int solution(int A[]) {
		final int arrSize = A.length;
		int dominator = A[0];
		int count = 0;

		for (int i : A) {
			if (i == dominator) {
				count++;
			} else {
				count--;
				if (count == 0) {
					count++;
					dominator = i;
				}
			}
		}

		// Dominator Frequency Count
		int freqCount = 0;
		int indx = 0;
		for (int j = 0; j < A.length; j++) {
			if (A[j] == dominator) {
				freqCount++;
				indx = j;
			}
		}

		if (freqCount > (arrSize / 2)) {
			return indx;
		} else {
			return -1;
		}

	}
}
