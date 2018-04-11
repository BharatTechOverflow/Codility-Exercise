package com.codility.shift;

public class BinayGap {
	public static void main(String[] args) {
		int num = 529 ;
		System.out.println(Integer.toBinaryString(num));
		System.out.println(solution(num));

	}

	public static int solution(int N) { 
		int maxGap = 0;
		int countGap = -1;
		int rightMostBit = 0;

		while (N > 0) {
			// get right most bit & shift right(Remove Right most Bit)
			rightMostBit = N & 1;
			System.out.println("   " + rightMostBit);
			N = N >> 1;
			System.out.println("  shift right  " + Integer.toBinaryString(N));
			System.out.println("  shift right  " + N);

			if (0 == rightMostBit && countGap >= 0) {
				System.out.println(" count  " + countGap   +"  "+ rightMostBit);
				countGap++;
			}

			if (1 == rightMostBit) {
				maxGap = countGap > maxGap ? countGap : maxGap;
				countGap = 0;
			}
		}

		return maxGap;
	}
}
