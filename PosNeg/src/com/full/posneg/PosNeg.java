package com.full.posneg;
/*
 *Shangeeth Sivan
 *06-Mar-2017 
 *PosNeg
 */
public class PosNeg {
	/**
	 * returns true if one is negative and one is positive. Except if the
	 * parameter "negative" is true, then returns true only if both are
	 * negative.
	 * 
	 * @param a
	 * @param b
	 * @param negative
	 * @return
	 */
	public static Boolean posNeg(int a, int b, boolean negative) {
		if (negative)
			return a < 0 && b < 0;
		else
			return (a < 0 && b > 0) || (a > 0 && b < 0);
	}
}
