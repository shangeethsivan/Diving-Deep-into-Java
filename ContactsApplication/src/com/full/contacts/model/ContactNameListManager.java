/**
 * @author Shangeeth Sivan
 * @date 15-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContactNameListManager {

	public static final String CONTACT_N_FOUND = "NOT_FOUND#";

	private static List<String> contactsFirstNameList;

	public static void setContactsList(List<String> contactsFirstNameList) {
		ContactNameListManager.contactsFirstNameList = contactsFirstNameList;
	}

	public static List<String> getContactList() {
		if (contactsFirstNameList == null)
			return null;
		else
			return contactsFirstNameList;
	}

	public void addContactToList(String contactName) {

		if (contactsFirstNameList != null) {
			contactsFirstNameList.add(contactName);
			Collections.sort(contactsFirstNameList);
		} else {
			contactsFirstNameList = new ArrayList<>();
			addContactToList(contactName);
		}
	}

	public static boolean checkContactName(String contactName) {
		return contactsFirstNameList.contains(contactName);
	}

	public static String checkContactIndex(Integer position) {

		String contactName = "";

		try {
			contactName = contactsFirstNameList.get(position - 1);
		} catch (IndexOutOfBoundsException e) {
			return CONTACT_N_FOUND;
		}

		return contactName;
	}

	public static void main(String[] args) {

		ContactNameListManager contactListManager = new ContactNameListManager();

		contactListManager.addContactToList("Shangeeth");
		contactListManager.addContactToList("Shangeeth");
		contactListManager.addContactToList("Data");
		contactListManager.addContactToList("Shivthepro");
	}

}
