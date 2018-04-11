/**
 * 
 */
package com.codility.lession5;

/**
 * @author s727953
 *
 */
public class PassingCars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 0, 1, 0, 1, 1 };// TODO Auto-generated method stub
		System.out.println(passing_cars(A));
	}

	public static int passing_cars(int[] A) {
		int noEstDrivingCars = 0; // how many going east
		int passingCarPair = 0; // total passing cars pairs

		// Travel the list from beginning to end
		for (int i : A) {

			if (i == 1) {
				passingCarPair += noEstDrivingCars;
			} else
				noEstDrivingCars++;
			System.out.println(passingCarPair);
		}
		if (passingCarPair > 1e9 || passingCarPair < 0)
			return -1;
		else
			return passingCarPair;
	}

}
