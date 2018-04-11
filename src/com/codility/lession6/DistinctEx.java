/**
 * 
 */
package com.codility.lession6;

import java.util.HashSet;
import java.util.Set;

/**
 * @author s727953
 *
 */
public class DistinctEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 2, 1, 1, 2, 3, 1, 3, 7 };//
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		Set<Integer> dist = new HashSet<>();
		for (Integer i : A) {
			dist.add(i);
		}
		return dist.size();

	}

}
