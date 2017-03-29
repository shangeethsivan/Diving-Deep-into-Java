/**
 * @author Shangeeth Sivan
 * @date 18-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.full.contacts.util.CantContainHashesException;

import static java.lang.System.out;

public class InputHelper {

	public static int getIntegerFromUser(Scanner scanner) {

		boolean isUserInputNotVaild = false;
		int userInput = 0;

		do {
			isUserInputNotVaild = false;
			try {
				userInput = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				out.println("Invalid Input Enter Again:");
				// e.printStackTrace();
				isUserInputNotVaild = true;
			}
		} while (isUserInputNotVaild);

		return userInput;
	}

	public static long getLongFromUser(Scanner scanner) {

		boolean isUserInputNotVaild = false;
		long userInput = 0;

		do {
			isUserInputNotVaild = false;
			try {
				userInput = Long.parseLong(scanner.nextLine());
			} catch (NumberFormatException e) {
				out.println("Invalid Input Enter Again:");
				// e.printStackTrace();
				isUserInputNotVaild = true;
			}
		} while (isUserInputNotVaild);

		return userInput;
	}

	public static String getStringFromUser(Scanner scanner) {

		boolean isUserInputNotVaild = false;
		String userInput = "";

		do {
			isUserInputNotVaild = false;
			try {
				userInput = scanner.nextLine();
				if (userInput.contains("#"))
					throw new CantContainHashesException("Contains a hash which is not allowed in our application");
			} catch (InputMismatchException e) {
				out.println("Invalid Input Enter Again:");
				// e.printStackTrace();
				isUserInputNotVaild = true;
			} catch (CantContainHashesException e) {
				out.println("Hashes '#' are not allowed please re-type");
				isUserInputNotVaild = true;
			}
		} while (isUserInputNotVaild);

		return userInput;
	}

	// Testing InputHelper
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		getIntegerFromUser(scanner);
		getStringFromUser(scanner);
		getLongFromUser(scanner);
	}
}
