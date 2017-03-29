/*
 *Shangeeth Sivan
 *08-Mar-2017 
 *StringReverser
 */
package com.full.tester;

import static java.lang.System.out;

public class StringCompare {

	/**
	 * Compares the two values of actual and expected and prints out the result
	 * 
	 * @param expected
	 *            The expected String
	 * @param actual
	 *            The actual String
	 */
	private static void checkResult(String actual, String expected) {
		String result = actual.equals(expected) ? "Passed" : "Failed";

		out.println("Expected :" + expected + "\nActual   :" + actual + "\nTest Case " + result + "\n");
	}
}
