package com.codility.shift;

public class EqulibriumTest {

	public static void main(String[] args) {

		int[] A = { -1, 3, -4 };
		System.out.println(solution(A, A.length));

	}

	public static int solution(int[] arr, int N) {
		final int size = arr.length;
		// If N in not within the range
		if (N > size || N <= 0) {
			return -1;
		}

		int sumleading = 0;
		int sumTrainling = 0;

		for (int i = 0; i < arr.length; i++) {
			sumleading = 0;

			for (int j = 0; j <= i; j++) {
				sumleading += arr[j];
				System.out.println("sumleading  " + sumleading);
			}
			sumTrainling = 0;
			for (int j = i + 1; j < arr.length; j++) {
				sumTrainling += arr[j];
			}

			System.out.println(sumTrainling);
			if (sumleading == sumTrainling) {
				return i;
			}
		}
		return -1;

	}

}
