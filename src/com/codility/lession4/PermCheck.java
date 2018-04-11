package com.codility.lession4;

import static java.lang.System.out;

public class PermCheck {
	public static void main(String[] args) {
		// out.println(solution(new int[] { 4, 1, 3, 2 }));
		// out.println(solution(new int[] { 4, 1, 3 }));
		// out.println(solution(new int[] { 2, 1, 3 }));
		out.println(solution(new int[] { 1, 8, 3 }));
		// out.println(solution(new int[] { 3, 2, 1 }));
		// out.println(solution(new int[] { 1 }));
		// out.println(solution(new int[] { 1 }));
		// out.println(solution(new int[] { 1000000000 }));
	}

	public static int solution(int[] A) {
		final int arrLen = A.length;
		boolean[] alreadySeen = new boolean[arrLen + 1];

		for (int i = 0; i < arrLen; i++) {
			if (A[i] < 1 || A[i] > arrLen)
				return 0;
			if (alreadySeen[A[i]] == true)
				return 0;
			else
				alreadySeen[A[i]] = true;

		}

		for (int i = 0; i < alreadySeen.length; i++) {
			System.err.println(alreadySeen[i]);
		}
		return 1;
	}

}
