package com.codility.time;

import java.util.stream.IntStream;

public class PermMissingElem {
	public static void main(String[] args) {
		int[] data = { 2, 3, 1, 5 };

		System.out.println(solution(data));
	}

	public static final long solution(final int[] data) {
		long arrLen = data.length + 1;
		System.out.println(arrLen);

		long arrSizeTotal = (arrLen * (arrLen + 1)) / 2;
		System.out.println(arrSizeTotal);

		long sum = IntStream.of(data).sum();
		System.out.println(sum);
		return arrSizeTotal - sum;
	}

}
