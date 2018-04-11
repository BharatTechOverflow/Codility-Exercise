/**
 * 
 */
package com.codility.time;

/**
 * @author s727953
 *
 */
public class FrogJmp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(solution(10, 85, 30));
	}

	public static int solution(int X, int Y, int D) {
		// write your code in Java SE 8
		final int totalDist = Y - X; 
		final int jumpDist = D;
		if (totalDist % jumpDist == 0) {
			return totalDist / jumpDist;
		} else {
			return (totalDist / jumpDist) + 1;
		}
	}
}
