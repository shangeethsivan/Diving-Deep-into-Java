/**
 * @author Shangeeth Sivan
 * @date 21-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.controller;

import java.util.Scanner;

import com.full.contacts.model.ContactDB;
import com.full.contacts.model.ContactNameListManager;
import com.full.contacts.pojo.Contact;
import com.full.contacts.pojo.Name;
import com.full.contacts.pojo.PhoneNumber;
import com.full.contacts.view.InputHelper;
import com.full.contacts.view.NameHelper;
import com.full.contacts.view.PhoneNumberHelper;
import com.full.contacts.view.PrintHelper;

public class EditContactController {

	public void editContact(Scanner scanner, Contact contact, int index) {
		PrintHelper.editContactMenu(contact);
		processEditContactMenu(scanner, contact, index);
	}

	public void processEditContactMenu(Scanner scanner, Contact contact, int index) {
		boolean badInput = false;
		do {
			int userInput = InputHelper.getIntegerFromUser(scanner);

			switch (userInput) {
			case 1:
				PrintHelper.showDataToUser(
						"Old Name details:" + contact.getName().toString() + "\n Please Enter the New Details");
				Name name = new NameHelper().getNameFromUser(scanner);
				contact.setName(name);
				ContactDB.nameChangedSortList();

				ContactNameListManager.getContactList().remove(index);
				ContactNameListManager listMananger = new ContactNameListManager();
				listMananger.addContactToList(name.getFirstName());
				break;
			case 2:
				PrintHelper.showDataToUser(
						"Old Name details:" + contact.getEmail().toString() + "\n Please Enter the New Details");
				PhoneNumber number = new PhoneNumberHelper().getNumberFromUser(scanner);
				contact.setNumbers(number);
				break;
			case 3:
				// address
				break;
			default:
				badInput = false;
				break;
			}

		} while (badInput);
	}
}
