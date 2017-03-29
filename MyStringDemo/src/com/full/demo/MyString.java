/**
 * @author Shangeeth Sivan
 * @date 09-Mar-2017 
 * @category MyStringDemo
 */
package com.full.demo;

import static java.lang.System.out;

import com.full.tester.Tester;
import com.full.util.AbstractMyString;

public class MyString extends AbstractMyString {

	private int length;

	public MyString(String data) {
		super.theString = data;
		length = data.length();
	}

	@Override
	public String reverse() {
		char tempArray[] = super.theString.toCharArray();
		char revArray[] = new char[super.theString.length()];

		for (int i = 0; i < length; i++) {
			revArray[i] = tempArray[(length - 1) - i];
		}

		return String.valueOf(revArray);
	}

	@Override
	public int getVowelsCount() {
		int vowelCounter = 0;
		String temp = super.theString.toLowerCase();
		char tempArray[] = temp.toCharArray();

		for (int i = 0; i < length; i++) {
			char currentCharacter = tempArray[i];
			if (currentCharacter == 'a' || currentCharacter == 'e' || currentCharacter == 'i' || currentCharacter == 'o'
					|| currentCharacter == 'u') {
				vowelCounter++;
			}
		}

		return vowelCounter;
	}

	@Override
	public int getConsonantCount() {
		return getNumChars() - getVowelsCount();
	}

	@Override
	public int getNumCapitalLetters() {
		int numCapitalletters = 0;
		char tempArray[] = super.theString.toCharArray();

		for (int i = 0; i < length; i++) {
			if (tempArray[i] >= 65 && tempArray[i] <= 90) {
				numCapitalletters++;
			}
		}

		return numCapitalletters;
	}

	@Override
	public int getLength() {
		return length;
	}

	@Override
	public int getSumOfAllCharacters() {
		int sumOfAllCharaters = 0;
		char tempArray[] = super.theString.toCharArray();

		for (int i = 0; i < length; i++) {
			sumOfAllCharaters += tempArray[i];
		}

		return sumOfAllCharaters;
	}

	public int getNumChars() {
		int total_chars = 0;
		for (int i = 0; i < length; i++) {
			char temp = super.theString.charAt(i);
			if (temp >= 'a' && temp <= 'z' || temp >= 'A' && temp <= 'Z') {
				total_chars++;
			}
		}
		return total_chars;
	}

	/**
	 * Testing MyString Class
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		out.println("********----- TEST 1 -----********");
		MyString test1 = new MyString("TesT");
		Tester.compareString(test1.reverse(), "TseT");
		Tester.compareInt(test1.getVowelsCount(), 1);
		Tester.compareInt(test1.getConsonantCount(), 3);
		Tester.compareInt(test1.getNumCapitalLetters(), 2);
		Tester.compareInt(test1.getSumOfAllCharacters(), 384);
		Tester.compareInt(test1.getLength(), 4);

		out.println("********----- TEST 2 -----********");
		MyString test2 = new MyString("This is a string For TESting the MYSTRING CLaSs AEIOU");
		Tester.compareString(test2.reverse(), "UOIEA sSaLC GNIRTSYM eht gnitSET roF gnirts a si sihT");
		Tester.compareInt(test2.getVowelsCount(), 15);
		Tester.compareInt(test2.getConsonantCount(), 29);
		Tester.compareInt(test2.getNumCapitalLetters(), 21);
		Tester.compareInt(test2.getSumOfAllCharacters(), 4408);
		Tester.compareInt(test2.getLength(), 53);
	}

}
