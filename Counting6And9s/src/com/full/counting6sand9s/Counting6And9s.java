package com.full.counting6sand9s;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.HashMap;

/*
 *Shangeeth Sivan
 *06-Mar-2017 
 *Counting6And9s
 */
public class Counting6And9s {

	/**
	 * Compares the expected and actual values and prints the result
	 * 
	 * @param expected6s
	 * @param actual6s
	 * @param expected9s
	 * @param actual9s
	 */
	public static void checkResult(int expected6s, int actual6s, int expected9s, int actual9s) {
		String testResult6s = expected6s == actual6s ? "Passed" : "Failed";
		out.println("Expected 6's:" + expected6s + "\nActual   6's:" + actual6s + "\nTest Case " + testResult6s + "\n");
		String testResult9s = expected9s == actual9s ? "Passed" : "Failed";
		out.println("Expected 9's:" + expected9s + "\nActual   9's:" + actual9s + "\nTest Case " + testResult9s + "\n");

	}

	/**
	 * Counts the number of 6s,9s,consecutive group of 6s and consecutive group
	 * of 9s
	 * 
	 * @param list
	 * @return returns a ResultPojo object consisting of the required values
	 */
	public static ResultPojo count(ArrayList<Integer> list) {

		int numOfSix = count6s(list);
		int numOfNine = count9s(list);
		HashMap<String, Integer> map = consecutive6and9s(list);

		return new ResultPojo(numOfSix, numOfNine, map.get("cons_6"), map.get("cons_9"));
	}

	public static int count6s(ArrayList<Integer> list) {
		int count = 0;
		for (int currentValue : list) {
			if (currentValue == 6) {
				count++;
			}
		}
		return count;
	}

	public static int count9s(ArrayList<Integer> list) {
		int count = 0;
		for (int currentValue : list) {
			if (currentValue == 9) {
				count++;
			}
		}
		return count;
	}

	public static HashMap<String, Integer> consecutive6and9s(ArrayList<Integer> list) {

		// Counting the consecutive values
		int consecutiveSix = 0;
		int consecutiveNine = 0;
		int consecutiveFinder = 0;
		boolean consecutiveFlag = false;

		for (int currentValue : list) {
			if (currentValue == 6) {

				if (consecutiveFinder != currentValue)
					consecutiveFlag = false;
				if (currentValue == consecutiveFinder && !consecutiveFlag) {
					consecutiveSix++;
					consecutiveFlag = true;
				}
				consecutiveFinder = currentValue;
			} else if (currentValue == 9) {
				if (consecutiveFinder != currentValue)
					consecutiveFlag = false;
				if (currentValue == consecutiveFinder && !consecutiveFlag) {
					consecutiveNine++;
					consecutiveFlag = true;
				}
				consecutiveFinder = currentValue;
			} else {
				consecutiveFinder = 0;
				consecutiveFlag = false;
			}
		}
		HashMap<String, Integer> map = new HashMap<>();
		map.put("cons_6", consecutiveSix);
		map.put("cons_9", consecutiveNine);

		return map;
	}

	/**
	 * Testing Counting 6s and 9s
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		// Test Cases

		ArrayList<Integer> testList = new ArrayList<>();
		testList.add(100);
		testList.add(25);
		testList.add(6);
		testList.add(9);
		testList.add(9);
		testList.add(31);
		testList.add(6);
		testList.add(6);
		testList.add(6);
		testList.add(9);
		testList.add(9);
		testList.add(9);
		testList.add(9);
		testList.add(6);
		testList.add(6);
		testList.add(6);
		testList.add(63);
		testList.add(6);
		testList.add(6);
		testList.add(6);

		ResultPojo resultPojo = Counting6And9s.count(testList);

		checkResult(3, resultPojo.getConsecutiveSixGroups(), 2, resultPojo.getConsecutiveNineGroups());
	}
}
