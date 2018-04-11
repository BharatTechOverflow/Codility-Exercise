/**
 * 
 */
/**
 * @author s727953
 *
 */
package com.codility.lesson99;

public class StrSymmetryPoint {
	public static void main(String[] args) {
		String S = "racecar";
		System.out.println(solution(S));
	}

	public static int solution(String S) {
		char[] ch = S.toCharArray();
		if (ch.length == 1) {
			return 0;
		}
		if (ch.length % 2 == 0) {
			return -1;
		}
		int mid = (ch.length) / 2;

		for (int i = 0; i < mid; i++) {
			System.out.println(ch[i] + "  mid " + ch[ch.length - i - 1]);
			if (ch[i] != ch[ch.length - 1 - i])
				return -1;
		}
		return mid;
	}

}