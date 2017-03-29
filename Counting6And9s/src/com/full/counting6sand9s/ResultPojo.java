package com.full.counting6sand9s;

/*
 *Shangeeth Sivan
 *06-Mar-2017 
 *Counting6And9s
 */

/**
 * Used to Pass the resultant values as a object This was created when I had to
 * test the values in a separate class
 * 
 * @author user Shangeeth Sivan
 *
 */
public class ResultPojo {

	private int numoOfSix;
	private int numOfNine;
	private int consecutiveNumSixGroups;
	private int consecutiveNumNine;

	private ResultPojo() {
	}

	public ResultPojo(int six, int nine, int c_six, int c_nine) {
		this.numoOfSix = six;
		this.numOfNine = nine;
		this.consecutiveNumSixGroups = c_six;
		this.consecutiveNumNine = c_nine;
	}

	public int getNumOfNine() {
		return numOfNine;
	}

	public int getNumoOfSix() {
		return numoOfSix;
	}

	public int getConsecutiveNineGroups() {
		return consecutiveNumNine;
	}

	public int getConsecutiveSixGroups() {
		return consecutiveNumSixGroups;
	}
}
