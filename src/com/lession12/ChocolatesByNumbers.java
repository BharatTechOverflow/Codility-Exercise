/**
 * 
 */
/**
 * @author s727953
 *
 */
package com.lession12;

public class ChocolatesByNumbers {

	public static void main(String[] args) {
		System.out.println(solution(10, 4));
	}

	/*
	 * public static int solution(int N, int M) {
	 * 
	 * int startEndEating = 0; int nextChocolateToEat = 0; int totalAte = 0;
	 * 
	 * while (startEndEating == 0) { nextChocolateToEat = (nextChocolateToEat +
	 * M) % N; System.out.println(" nextChocolateToEat  "+ nextChocolateToEat);
	 * if (nextChocolateToEat != 0) { startEndEating = 0; } else {
	 * startEndEating++; } totalAte++; }
	 * 
	 * return totalAte; }
	 */
	public static int solution(int N, int M) {
		// least common multiple
		int gdc = gcd(N, M);
		System.out.println("GCD   " + gdc);

		int lcm = N / gdc;
		return lcm;
	}

	private static int gcd(int a, int b) {
		System.out.println("B  "+ b);
		if (a % b == 0) {
			return b;
		}

		System.out.println("A " + a + " B " + b + "    A%B   " + (a % b));
		return gcd(b, a % b);
	}

}
