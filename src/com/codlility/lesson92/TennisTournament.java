/**
 * 
 */
/**
 * @author s727953
 *
 */
package com.codlility.lesson92;

public class TennisTournament {

	public static void main(String[] args) {
		System.out.println("-------------  ");
		int P = 5, C = 3;
		System.out.println(solution(P, C));
		int P1 = 10, C1 = 3;
		System.out.println(solution(P1, C1));
	}

	static int solution(int P, int C) {
		final int playerSet = P / 2; 
		if (playerSet >= C) {
			return C;
		} else if (playerSet < C) {
			return playerSet;
		} 
		return -1;
	}
}