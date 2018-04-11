/**
 * 
 */
/**
 * @author s727953
 *
 */
package com.codility.lesson90;

public class LongestPassword {

	public static void main(String[] args) {
		String A = "test 5 a0A pass007 ?xy1";
		System.out.println(solution(A));
	}

	public static int solution(String S) {
		String[] words = S.split(" ");
		String alphNumRegex = "^[0-9a-zA-Z]*$";
		String alphaRegex = "[a-zA-Z]+";
		String numRegex = "[0-9]+";
		int maxPassLen = -1;
		for (String word : words) {
			if (word.matches(alphNumRegex) && word.replaceAll(numRegex, "").length() % 2 == 0
					&& word.replaceAll(alphaRegex, "").length() % 2 == 1) {
				maxPassLen = Math.max(maxPassLen, word.length());
			}
		}
		return maxPassLen;
	}
}