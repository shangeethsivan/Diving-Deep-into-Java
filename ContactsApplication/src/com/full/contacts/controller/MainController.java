/**
 * @author Shangeeth Sivan
 * @date 14-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.controller;

import java.util.Scanner;

import com.full.contacts.view.PrintHelper;
import com.full.contacts.view.InputHelper;

public class MainController {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userInput = 0;
		do {

			PrintHelper.showMainMenu();

			userInput = InputHelper.getIntegerFromUser(scanner);

			switch (userInput) {

			case 1:
				// New Contact
				NewContactController newContactController = new NewContactController();
				newContactController.addNewContact(scanner);
				break;

			case 2:
				// Search
				SearchController searchController = new SearchController();
				searchController.initiateSearch(scanner);
				break;

			case 3:
				// View All Contact
				ContactViewController contactsViewController = new ContactViewController();
				contactsViewController.showAllContacts(scanner);
				break;

			case 4:
				// Exit
				PrintHelper.showDataToUser("Exiting Application...");
				break;
			}
		} while (userInput != 4);

		scanner.close();
	}

}

