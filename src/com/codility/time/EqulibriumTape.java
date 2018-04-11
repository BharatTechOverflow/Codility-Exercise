package com.codility.time;

public class EqulibriumTape {

	public static void main(String[] args) {

		int[] A = { 3, 1, 2, 4, 3 };
		System.out.println(solution(A, A.length));

	}

	public static int solution(int[] A, int N) {
		int leftSum = A[0];
		int rightSum = 0;

		for (int i = 1; i < A.length; i++) {
			rightSum += A[i];
		}

		int difMin = Math.abs(rightSum - leftSum);
		int tempdiff = 0;

		for (int i = 1; i < A.length - 1; i++) {
			leftSum += A[i];
			rightSum -= A[i];
			tempdiff = Math.abs(rightSum - leftSum);
			if (tempdiff < difMin) {
				difMin = tempdiff;

			}
		}
		return difMin;
	}

}
