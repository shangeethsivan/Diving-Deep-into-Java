/**
 * @author Shangeeth Sivan
 * @date 09-Mar-2017 
 * @category Tester
 */
package com.full.tester;

import static java.lang.System.out;

public class Tester {

	/**
	 * Compares the two values of actual and expected and prints out the result
	 * 
	 * @param expected
	 *            The expected String
	 * @param actual
	 *            The actual String
	 */
	public static void compareString(String actual, String expected) {
		String result = actual.equals(expected) ? "Passed" : "Failed";

		out.println("Expected :" + expected + "\nActual   :" + actual + "\nTest Case " + result + "\n");
	}

	/**
	 * Compares the two values of actual and expected and prints out the result
	 * 
	 * @param expected
	 *            The expected boolean
	 * @param actual
	 *            The actual boolean
	 */
	public static void compareBoolean(boolean actual, boolean expected) {
		String result = actual == expected ? "Passed" : "Failed";

		out.println("Expected :" + expected + "\nActual   :" + actual + "\nTest Case " + result + "\n");
	}

	/**
	 * Compares the two values of actual and expected and prints out the result
	 * 
	 * @param expected
	 *            The expected int value
	 * @param actual
	 *            The actual int value
	 */
	public static void compareInt(int actual, int expected) {
		String result = actual == expected ? "Passed" : "Failed";

		out.println("Expected :" + expected + "\nActual   :" + actual + "\nTest Case " + result + "\n");
	}
}
