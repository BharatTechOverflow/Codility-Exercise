/**
 * 
 */
package com.codility.lession10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author s727953
 *
 */
public class FlagsCounts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 };
		System.out.println(solution(A, A.length));
	}

	public static int solution(int[] A, int N) {
		int flagsCount = 0;
		List<Integer> numOfHils = new ArrayList<>();

		if (N >= 3) {
			for (int i = 1; i < A.length - 1; i++) {
				int X = A[i - 1];
				int Y = A[i];
				int Z = A[i + 1];
				if (X < Y && Y > Z) {
					numOfHils.add(i);
				}
			}
		}

		for (int n = numOfHils.size(); n > 0; n--) {
			int i = numOfHils.get(0);
			int flagHosted = 1;
			while (true) {
				int next = i + n;
				int pos = Collections.binarySearch(numOfHils, next);
				System.out.println(pos);
				if (pos < 0) {
					pos = -(pos + 1);
					if (pos >= numOfHils.size()) {
						break;
					}
				}
				i = numOfHils.get(pos);
				flagHosted++;
			}
			if (flagHosted == n) {
				return flagHosted;
			}

		}
		return 0;

	}
}
