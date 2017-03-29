/**
 * @author Shangeeth Sivan
 * @date 18-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.view;

import static java.lang.System.out;

import java.util.Scanner;

import com.full.contacts.pojo.Email;
import com.full.contacts.util.InstanceFactory;
import com.full.contacts.util.ValidationHelper;

public class EmailHelper {

	private static final String PERSONAL = "Personal";
	private static final String OFFICIAL = "Official";

	public Email getEmailFromUser(Scanner scanner) {

		Email email = InstanceFactory.getEmailInstance();

		out.print("***Email Id***\n");

		String continueflag = "no";
		do {
			out.println("Please select and Option to enter the Email:");
			out.println("1.Personal \n2.Official \n3.Custom");

			String emailId = null;
			String label = "";

			int optionSelected = InputHelper.getIntegerFromUser(scanner);

			switch (optionSelected) {
			case 1:
				out.print("Enter the Personal Email id:");
				emailId = getEmailAddressFromUser(scanner);
				label = PERSONAL;
				break;
			case 2:
				out.print("Enter the Official Email id:");
				emailId = getEmailAddressFromUser(scanner);
				label = OFFICIAL;
				break;
			case 3:
				out.print("Enter the Custom Email Id: Enter the Label First:");

				label = InputHelper.getStringFromUser(scanner);
				emailId = getEmailAddressFromUser(scanner);
				break;
			default:
				out.println("Enter a vaild Input");

				break;
			}

			email.addEmail(label, emailId);

			out.print("Enter \"yes\" to continue adding a Email Id \"No\" to end");
			continueflag = scanner.nextLine();

		} while (continueflag.equals("yes"));

		return email;
	}

	/**
	 * Validating the Email address
	 * 
	 * @return
	 */
	private String getEmailAddressFromUser(Scanner scanner) {

		String email = "";
		boolean validEmailId = true;

		do {
			if (!validEmailId)
				PrintHelper.showDataToUser("Enter a valid Email ID");

			validEmailId = false;

			email = InputHelper.getStringFromUser(scanner);

			if (ValidationHelper.validateEmail(email)) {
				validEmailId = true;
			}

		} while (!validEmailId);

		return email;

	}
}
