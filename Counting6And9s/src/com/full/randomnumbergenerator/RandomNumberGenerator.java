package com.full.randomnumbergenerator;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
 *Shangeeth Sivan
 *06-Mar-2017 
 *Counting6And9s
 */
public class RandomNumberGenerator {
	private final int SIZE = 10_000_000;
	private final int MIN = 1;
	private final int MAX = 99;

	public void generateRandomNumbers(List<Integer> numbers, int min, int max, int size) {
		numbers.clear();

		for (int i = 0; i < SIZE; i++) {

			// http://stackoverflow.com/a/363692
			int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			numbers.add(randomNum);
		}
	}

	public void generateRandomNumbers(List<Integer> numbers, int min, int max) {
		generateRandomNumbers(numbers, min, max, SIZE);
	}

	public void generateRandomNumbers(List<Integer> numbers) {
		generateRandomNumbers(numbers, MIN, MAX, SIZE);
	}
}
