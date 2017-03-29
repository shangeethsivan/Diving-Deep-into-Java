package com.full.randomnumbergenerator;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

/*
 *Shangeeth Sivan
 *06-Mar-2017 
 *Counting6And9s
 */
public class RandomNumberTester {
	public static void main(String[] args) {
		boolean isRangePassed = true;
		List<Integer> numbers = new ArrayList<>();
		RandomNumberGenerator generator = new RandomNumberGenerator();

		generator.generateRandomNumbers(numbers);

		for (int number : numbers) {
			if (number <= 0 || number >= 100) {
				isRangePassed = false;
				out.println("test failed" + number);
			}
		}
		if (isRangePassed) {
			out.println("Range test Passed");
		}
	}
}
