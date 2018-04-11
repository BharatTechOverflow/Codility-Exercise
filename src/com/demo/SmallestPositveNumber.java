package com.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 */

/**
 * @author s727953
 *
 */
public class SmallestPositveNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 1, 3, 6, 4, 1, 2 };
		System.out.println(solution(A));
		int[] B = { 1, 2, 3 };
		System.out.println(solution(B));
		int[] C = { -1, -3 };
		System.out.println(solution(C));

	}

	public static int solution(int[] A) {
		Set<Integer> uniqeElemSet = new HashSet<Integer>();

		// add all the unique and positive integer in set
		for (Integer i : A) {
			if (i > 0) {
				uniqeElemSet.add(i);
			}
		}
		// if set length is 0 or array contains only negative values
		if (uniqeElemSet.size() <= 0) {
			return 1;
		} else {
			int idx = 1;
			for (Integer val : uniqeElemSet) {
				// if integer missing in middle
				if (idx != val) {
					return idx;
				} else if (idx == uniqeElemSet.size()) {
					// if integer missing in end
					return ++idx;
				}
				idx++;

			}
		}

		return 0;

	}
}
