package com.full.posneg;
import static java.lang.System.out;




/*
 *Shangeeth Sivan
 *06-Mar-2017 
 *PosNeg
 */
public class PosNegTester {

	/**
	 * Compares the two values of actual and expected and prints out the result
	 * 
	 * @param expected
	 *            The expected String
	 * @param actual
	 *            The actual String
	 */
	private static void checkResult(Boolean expected, Boolean actual) {
		String result = expected == actual ? "Passed" : "Failed";

		out.println("Expected :" + expected + "\nActual   :" + actual + "\nTest Case " + result + "\n");
	}

	public static void main(String[] args) {
		PosNeg pNObject = new PosNeg();

		checkResult(true, pNObject.posNeg(1, -1, false));
		checkResult(true, pNObject.posNeg(-1, 1, false));
		checkResult(false, pNObject.posNeg(1, 1, false));
		checkResult(false, pNObject.posNeg(-1, -1, false));
		
		checkResult(true, pNObject.posNeg(-1, -1, true));
		checkResult(false, pNObject.posNeg(-1, 1, true));
		checkResult(false, pNObject.posNeg(1, 1, true));

		checkResult(false, pNObject.posNeg(1, -1, true));
	}
}
