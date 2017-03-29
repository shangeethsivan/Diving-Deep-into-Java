package com.full.main;

import static java.lang.System.out;

import java.util.ArrayList;

import com.full.counting6sand9s.Counting6And9s;
import com.full.counting6sand9s.ResultPojo;
import com.full.randomnumbergenerator.RandomNumberGenerator;

/*
 *Shangeeth Sivan
 *06-Mar-2017 
 *Counting6And9s
 */
public class MainController {
	/**
	 * Checking for the number of nine's ,six's, consecutive six groups and
	 * consecutive nine groups in the randomly generated list
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		long start = System.currentTimeMillis();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		RandomNumberGenerator generator = new RandomNumberGenerator();
		generator.generateRandomNumbers(arrayList);

		ResultPojo result = Counting6And9s.count(arrayList);

		long stop = System.currentTimeMillis();
		long totalRuntime = stop - start;

		out.println("NumOfSix: " + result.getNumoOfSix() + "\nNumOfNine's: " + result.getNumOfNine());
		out.println("Consecutive Six groups: " + result.getConsecutiveSixGroups() + "\nConsecutive Nine groups: "
				+ result.getConsecutiveNineGroups());

		out.println("Total runtime: " + totalRuntime + "ms");
	}
}
