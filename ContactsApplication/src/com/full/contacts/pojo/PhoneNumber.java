/**
 * @author Shangeeth Sivan
 * @date 14-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.pojo;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Storing the contact's mobile number in a separate entity. Allows us to have
 * custom labeled numbers
 * 
 * @author Shangeeth Sivan
 *
 */
public class PhoneNumber {

	private Map<String, Set<String>> numbers;

	public Map<String, Set<String>> getNumbers() {
		return numbers;
	}

	public void setNumbers(Map<String, Set<String>> numbers) {
		this.numbers = numbers;
	}

	/**
	 * Adding a custom number if the custom numbers is not null
	 * 
	 * @param label
	 *            The key used in the HashMap
	 * @param number
	 *            Value in the HashMap
	 */
	public void addNumber(String label, String value) {

		if (numbers != null) {

			if (numbers.containsKey(label))
				numbers.get(label).add(value);

			else {
				Set<String> set = new TreeSet<String>();
				set.add(value);

				numbers.put(label, set);
			}

		} else {
			numbers = new HashMap<>();
			addNumber(label, value);
		}
	}

	@Override
	public String toString() {

		if (numbers != null) {

			StringBuilder stringBuilder = new StringBuilder("\n***Mobile Numbers: ");

			for (Map.Entry<String, Set<String>> data : numbers.entrySet()) {
				stringBuilder.append("\n" + data.getKey() + "-");
				stringBuilder.append(data.getValue().toString());
			}

			return stringBuilder.toString();

		} else
			return "";

	}

	/**
	 * Testing Number class
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		PhoneNumber number = new PhoneNumber();
		number.addNumber("test", "1412312312");
		out.println(number.toString());
		sn.close();
	}
}
