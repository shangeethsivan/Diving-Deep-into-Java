/**
 * @author Shangeeth Sivan
 * @date 18-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.view;

import static java.lang.System.out;

import java.util.Scanner;

import com.full.contacts.pojo.PhoneNumber;
import com.full.contacts.util.InstanceFactory;
import com.full.contacts.util.ValidationHelper;

public class PhoneNumberHelper {

	private static final String HOME = "Home";
	private static final String WORK = "Work";
	private static final String MOBILE = "Mobile";

	public PhoneNumber getNumberFromUser(Scanner scanner) {

		PhoneNumber number = InstanceFactory.getPhoneNumberInstance();
		String continueflag = "no";

		out.print("***Phone Number***\n");
		boolean validInput = true;

		do {

			out.println("Please select and Option to enter the number:");
			out.println("1.Mobile \n2.Home \n3.Work \n4.Custom");

			String mobileNumber = null;
			String label = "";
			validInput = true;

			int optionSelected = InputHelper.getIntegerFromUser(scanner);

			switch (optionSelected) {
			case 1:
				out.print("Enter the mobile number:");
				mobileNumber = getMobileNumberFromUser(scanner);
				label = MOBILE;
				break;

			case 2:
				out.print("Enter the Home number:");
				mobileNumber = getMobileNumberFromUser(scanner);
				label = HOME;
				break;

			case 3:
				out.print("Enter the Work number:");
				mobileNumber = getMobileNumberFromUser(scanner);
				label = WORK;
				break;

			case 4:
				out.print("Enter the Custom number: Enter the Label First");
				scanner.nextLine();
				label = scanner.nextLine();
				mobileNumber = getMobileNumberFromUser(scanner);
				break;

			default:
				out.println("Enter a vaild Input");
				validInput = false;
				break;
			}

			if (validInput) {
				number.addNumber(label, mobileNumber);

				out.print("Enter \"yes\" to continue adding a mobile number");
				continueflag = scanner.nextLine();
			}
		} while (continueflag.equals("yes") || !validInput);

		return number;
	}

	/**
	 * Validating the mobile number Entered by the user
	 * 
	 * @param scanner
	 * @return
	 */
	private String getMobileNumberFromUser(Scanner scanner) {

		String number = "";
		boolean validMobileNumber = true;

		do {
			//PrintHelper.showDataToUser("Enter the Number");

			if (!validMobileNumber)
				PrintHelper.showDataToUser("Enter a valid Mobile Number");

			validMobileNumber = false;

			number = InputHelper.getStringFromUser(scanner);

			if (ValidationHelper.validateMobileNumber(number)) {
				validMobileNumber = true;
			}

		} while (!validMobileNumber);

		return number;
	}
}
