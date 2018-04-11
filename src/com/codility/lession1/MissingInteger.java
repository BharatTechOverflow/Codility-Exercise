/**
 * 
 */
package com.codility.lession1;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @author s727953
 *
 */
public class MissingInteger {
	private static final Logger LOGGER = Logger.getLogger(MissingInteger.class.getName());

	public static void main(String[] args) {
		int[] A = { -1, -3 };
		// int[] A = new int[] { -2, 3, 5, 6, 1, 4, 7 };
		int arrLen = A.length;
		int missing = findMissing1(A, arrLen);
		LOGGER.info("Missing {} " + missing);
	}

	private static int findMissing1(int[] A, int arrLen) {
		// Count Negative Integer in array
		int[] positiveIntArr = new int[arrLen];
		int x = 0;
		int negConunt = 0;
		for (int i = 0; i < arrLen; i++) {
			if (A[i] >= 0) {
				positiveIntArr[x] = A[i];
				x++;

			} else {
				negConunt++;
			}
		}
		if (negConunt < arrLen) {
			int sumElm = ((x + 1) * (x + 2)) / 2;
			for (int i : positiveIntArr) {
				sumElm = sumElm - i;
			}
			return sumElm;

		}

		return 0;

	}

	private static int findMissing(int[] A, int arrLen) {
		Arrays.sort(A);

		// Count Negative Integer in array
		int negCount = 0;
		for (int i = 0; i < arrLen; i++) {
			if (A[i] <= 0) {
				negCount++;
			}
		}
		if (negCount == arrLen) {
			// If array has only negative Integer
			return 1;
		} else {

			int[] positiveIntArr = new int[arrLen - negCount];

			int k = 0;

			for (int i = 0; i < arrLen; i++) {
				int currentNum = A[i];
				if (currentNum > 0) {
					if (i == (arrLen - 1)) {
						positiveIntArr[k] = currentNum;
						System.out.println(positiveIntArr[k]);
						k++;
					} else if ((currentNum != A[i + 1])) {
						positiveIntArr[k] = currentNum;
						System.out.println(positiveIntArr[k]);
						k++;
					}
				}

			}
			for (int j = 0; j < positiveIntArr.length; j++) {
				if (j + 1 != positiveIntArr[j]) {
					return j + 1;
				} else if ((positiveIntArr.length) == j + 1) {
					return j + 1 + 1;
				}
			}
		}

		return 0;

	}

}
