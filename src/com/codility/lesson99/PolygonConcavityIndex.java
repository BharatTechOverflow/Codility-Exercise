/**
 * 
 */
package com.codility.lesson99;

/**
 * @author s727953
 *
 */
public class PolygonConcavityIndex {
	class Point2D {
		public int x;
		public int y;

		/**
		 * @param x
		 * @param y
		 */
		public Point2D(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PolygonConcavityIndex px = new PolygonConcavityIndex();
		Point2D[] A = { px.new Point2D(-1, 3), px.new Point2D(1, 2), px.new Point2D(3, 1), px.new Point2D(0, -1),
				px.new Point2D(-2, 1) };
	}

}
