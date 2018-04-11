package com.codility.lession1;

import java.util.*;

public class Solution1 {

	public static void main(String[] args) {

		int M = 3;
		int[] A = {};// { 1, 2, 3, 3, 1, 3, 1 };
		System.out.println(solution(M, A));

	}

	static int solution(int M, int[] A) {
		int N = A.length;
		int[] count = new int[M + 1];
		for (int i = 0; i <= M; i++)
			count[i] = 0;
		int maxOccurence = 1;
		int index = -1;
		for (int i = 0; i < N; i++) {
			if (A[i] < M) {

				if (count[A[i]] > 0) {
					int tmp = count[A[i]];
					if (tmp > maxOccurence) {
						maxOccurence = tmp;
						index = i;
					}
					count[A[i]] = tmp + 1;
				} else {
					count[A[i]] = 1;
				}
			}
		}
		if (A.length <= 0) {
			return 0;
		}
		return A[index];
	}
}