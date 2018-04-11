/**
 * 
 */
/**
 * @author s727953
 *
 */
package com.codility.lesson15;

public class AbsCount {
	public static void main(String[] args) {
		int[] A = { -5, -3, -1, 0, 3, 6, 100 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		int absCount = 0;
		int maxVal = 0;
		for (int i : A) {
			int val = Math.abs(i);
			maxVal = Math.max(maxVal, val);

		} 
		boolean[] duplicate = new boolean[maxVal + 1];
		for (int b : A) {
			int val = Math.abs(b);

			if (duplicate[val] == true) {
			} else {
				duplicate[val] = true;
				absCount++;
			}

		}
		return absCount;

	}
}