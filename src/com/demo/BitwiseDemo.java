package com.demo;

public class BitwiseDemo {

	public static void main(String[] args) {

		System.out.println("new BitwiseXOR().bitXor(5,8) = " + new BitwiseDemo().bitXor2Intger(5, 8));
	}

	public int bitXor2Intger(int m, int n) {

		int result = m;
		for (int i = m + 1; i < n + 1; i++) {
			result = bitXor(result, i);
		}
		return result;
	}

	/**
	 * Bitwise XOR
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	private int bitXor(int a, int b) {

		int result = 0;
		int[] binArray = new int[32];
		for (int i = 31; i >= 0; i--) {
			binArray[i] = (int) Math.pow(2, i);
		}
		for (int i = 31; i >= 0; i--) {
			if (a >= binArray[i] && b >= binArray[i]) {
				a -= binArray[i];
				b -= binArray[i];
			} else if (a >= binArray[i] && b < binArray[i]) {
				a -= binArray[i];
				result += binArray[i];
			} else if (a < binArray[i] && b >= binArray[i]) {
				b -= binArray[i];
				result += binArray[i];
			}

		}
		return result;
	}

}
