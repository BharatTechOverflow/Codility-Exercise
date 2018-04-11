/**
 * 
 */
package com.codility.lesson7;

import java.util.Stack;

/**
 * @author s727953
 *
 */
public class Brackets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String S = "{[()()]}";
		System.out.println(solution(S));

	}

	public static int solution(String S) {

		Stack<Character> leftBracketStack = new Stack<Character>();

		char[] strChar = S.toCharArray();
		for (char ch : strChar) {
			if (ch == ')' || ch == ']' || ch == '}') {
				if (leftBracketStack.empty()) {
					return 0;
				}
				char top = leftBracketStack.pop();
				System.out.println(" top   " + top);
				if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
					return 0;
				}
			} else {
				System.out.println(" push " + ch);
				leftBracketStack.push(ch);
			}

		}
		return leftBracketStack.empty() ? 1 : 0;
	}
}
