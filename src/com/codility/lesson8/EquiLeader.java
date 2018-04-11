/**
 * 
 */
/**
 * @author s727953
 *
 */
package com.codility.lesson8;

public class EquiLeader {
	public static void main(String[] args) {
		int[] A = { 4, 3, 4, 4, 4, 2 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {
		int arrLen =A.length;
		int equiLeaders = 0;

		int leader = A[0];
		int ctr = 1;

		for (int val : A) {
			if (val == leader)
				ctr++;
			else
				ctr--;

			if (ctr == 0) {
				ctr = 1;
				leader = val;
			}
		}
		System.out.println(leader);

		// check if it's a leader?
		int freqCount = 0;
		for (int i : A) {
			if (i == leader)
				freqCount++;
		}

		if (freqCount <= (arrLen / 2))
			return 0;

		int ldrCount = 0;
		for (int i = 0; i < arrLen; i++) {
			if (A[i] == leader)
				ldrCount++;
			int leadersInRightPart = (freqCount - ldrCount);
			if (ldrCount > (i + 1) / 2 && leadersInRightPart > (arrLen - i - 1) / 2) {
				equiLeaders++;
			}
		}
		return equiLeaders;

	}

}