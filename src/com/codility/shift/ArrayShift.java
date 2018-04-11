package com.codility.shift;

class ArrayShift {

	public static void main(String[] args) {
		int[] A = { 3, 8, 9, 7, 6 };
		solution(A, 1);
	}

	public static int[] solution(int[] A, int K) {

		int[] shift = new int[A.length];
		int Pos = -1;

		if (A.length <= 1) {
			return A;

		}
		if (K > A.length) {
			K = K % A.length;
		}

		for (int i = 0; i < A.length; i++) {
			if ((i + K) > A.length - 1) {
				Pos = Math.abs(A.length - (i + K));
			} else {
				Pos = i + K;
			}
			System.out.println(Pos);
			shift[Pos] = A[i];

		}
		for (int i = 0; i < shift.length; i++) {
			System.err.print(shift[i] + "   ");
		}

		return shift;

	}
}