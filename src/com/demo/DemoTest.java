/**
 * 
 */
package com.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author s727953
 *
 */
public class DemoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> se = new HashSet<>();
		// se.add(new A("A"));
		// se.add(new A("C"));
		// se.add(new A("B"));

		se.add("A");

		se.add("D");

		se.add("C");
		 for (String string : se) {
			System.out.println(string);
		}}

	static class A {
		private String str;

		public A(String str) {
			super();
			this.str = str;
		}

		/**
		 * @return the str
		 */
		public String getStr() {
			return str;
		}

		/**
		 * @param str
		 *            the str to set
		 */
		public void setStr(String str) {
			this.str = str;
		}

	}
}
