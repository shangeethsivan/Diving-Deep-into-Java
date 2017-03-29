/**
 * @author Shangeeth Sivan
 * @date 23-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.controller;

import java.util.Scanner;

import com.full.contacts.model.ContactDB;
import com.full.contacts.pojo.Contact;
import com.full.contacts.util.DummyData;
import com.full.contacts.view.InputHelper;
import com.full.contacts.view.PrintHelper;

public class SearchController {

	public void initiateSearch(Scanner scanner) {

		boolean contactNotFound = true;

		do {

			PrintHelper.showDataToUser("Enter the First name of the contact to search or '0' to go to main menu");

			contactNotFound = true;

			String userInput = InputHelper.getStringFromUser(scanner);

			if (userInput.equals("0"))
				return;

			ContactDB contactDB = new ContactDB();
			Contact contact = contactDB.searchContact(userInput);

			if (contact == null) {
				contactNotFound = false;

				PrintHelper.showDataToUser("No Contact Found");
			} else {
				PrintHelper.showDataToUser(contact.toString());

			}

		} while (contactNotFound);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		DummyData.insert();
		SearchController controller = new SearchController();
		controller.initiateSearch(scanner);
	}
}
