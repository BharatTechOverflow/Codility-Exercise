/**
 * 
 */
/**
 * @author s727953
 *
 */
package com.codility.lesson7;

import java.util.Stack;

public class StoneWell {

	public static void main(String[] args) {

		int[] H = { 8, 8, 5, 7, 9, 8, 7, 4, 8 };
		System.out.println(solution(H));
	}

	public static int solution(int[] H) {
		Stack<Integer> hightStack = new Stack<Integer>();
		int cuboidStoneCount = 0;

		for (int i = 0; i < H.length; i++) {
			if (hightStack.size() == 0) {
				cuboidStoneCount++;
				hightStack.push(H[i]);
			} else {
				if (hightStack.peek() > H[i]) {
					while (hightStack.size() > 0 && hightStack.peek() > H[i]) {
						hightStack.pop();
					}
					i--;
				} else if (hightStack.peek() < H[i]) {
					cuboidStoneCount++;
					hightStack.push(H[i]);
				}
			}
		}
		return cuboidStoneCount;
	}

}
