/**
 * @author Shangeeth Sivan
 * @date 20-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.controller;

import java.util.List;

import java.util.Scanner;

import com.full.contacts.model.ContactDB;
import com.full.contacts.model.ContactListManager;
import com.full.contacts.pojo.Contact;
import com.full.contacts.view.InputHelper;
import com.full.contacts.view.PrintHelper;

public class ContactViewController {

	public void showAllContacts(Scanner scanner) {

		List<String> contactNames = ContactListManager.getContactList();

		if (contactNames == null || contactNames.size() == 0)
			System.out.println("No Contacts Available");

		else {

			PrintHelper.printContactName(contactNames);

			PrintHelper.showDataToUser(
					"Please Enter the Contact's Number to view the whole details\nEnter '0' to Goto Main Menu");
			// processing input for contact getting contact details
			String contactName = "";
			int userInput = -1;

			do {
				if (contactName.equals(ContactListManager.CONTACT_N_FOUND))
					PrintHelper.showDataToUser(
							"Please Enter Values only Shown in the above List\n Enter '0' to Goto Main Menu");

				userInput = InputHelper.getIntegerFromUser(scanner);

				if (userInput == 0) {
					return;

				} else {
					contactName = ContactListManager.checkContactIndex(userInput);
				}

			} while (contactName.equals(ContactListManager.CONTACT_N_FOUND));

			if (!contactName.equals(ContactListManager.CONTACT_N_FOUND)) {

				ContactDB contactsDB = new ContactDB();
				Contact contact = contactsDB.getContactInPostion(userInput - 1);

				PrintHelper.showDataToUser(contact.toString());
				PrintHelper.contactDetailMenu();
				processContactDetailMenuInput(scanner, contact, userInput - 1);

			}
		}
	}

	public void processContactDetailMenuInput(Scanner scanner, Contact contact, int index) {
		int userInput = -1;
		boolean badInput = false;
		do {
			userInput = InputHelper.getIntegerFromUser(scanner);
			if (badInput) {
				PrintHelper.showDataToUser("Enter Choice shown in above list");
				badInput = false;
			}
			if (userInput == 0) {
				return;
			} else {

				switch (userInput) {
				case 1:
					// Edit Contact
					EditContactController editController = new EditContactController();
					editController.editContact(scanner, contact, index);
					break;
				case 2:
					// Delete Contact
					break;
				default:
					badInput = true;
					break;
				}
			}
		} while (badInput);
	}
}
