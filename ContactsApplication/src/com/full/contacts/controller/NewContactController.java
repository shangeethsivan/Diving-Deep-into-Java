/**
 * @author Shangeeth Sivan
 * @date 20-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.controller;

import java.util.Scanner;

import com.full.contacts.model.ContactDB;
import com.full.contacts.model.ContactListManager;
import com.full.contacts.pojo.Address;
import com.full.contacts.pojo.Contact;
import com.full.contacts.pojo.Email;
import com.full.contacts.pojo.Name;
import com.full.contacts.pojo.PhoneNumber;
import com.full.contacts.view.AddressHelper;
import com.full.contacts.view.EmailHelper;
import com.full.contacts.view.InputHelper;
import com.full.contacts.view.NameHelper;
import com.full.contacts.view.PhoneNumberHelper;
import com.full.contacts.view.PrintHelper;

public class NewContactController {

	public void addNewContact(Scanner scanner) {

		PrintHelper.showDataToUser("Enter the Name and Mobile number first \n "
				+ "after that you will be allowed to select form the options \n");

		Name name = new NameHelper().getNameFromUser(scanner);

		PhoneNumber number = new PhoneNumberHelper().getNumberFromUser(scanner);

		newContactMenuProcessor(scanner, new Contact(name, number, null));

	}

	private void newContactMenuProcessor(Scanner scanner, Contact contact) {

		int userInput = 0;

		do {

			PrintHelper.newContactMenu();

			userInput = InputHelper.getIntegerFromUser(scanner);

			switch (userInput) {

			case 1:
				Email email = new EmailHelper().getEmailFromUser(scanner);
				contact.setEmail(email);
				break;

			case 2:
				Address address = new AddressHelper().getAddressFromUser(scanner);
				contact.setAddress(address);
				break;

			case 3:
				// saving fistName in list
				ContactListManager listManager = new ContactListManager();
				listManager.addContactToList(contact.getName().getFirstName());

				// saving contact in DB
				ContactDB contactDB = new ContactDB();
				contactDB.addContact(contact);

				PrintHelper.showImpMessageToUser("Contact Saved Successfully");
				break;
			}
		} while (userInput != 3);

	}
}
