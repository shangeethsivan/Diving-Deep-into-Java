/**
 * @author Shangeeth Sivan
 * @date 15-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.model;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import com.full.contacts.pojo.Contact;
import com.full.contacts.util.DummyData;
import com.full.tester.Tester;

public class ContactDB {

	private static List<Contact> contacts;

	public static void nameChangedSortList() {
		if (contacts != null)
			Collections.sort(contacts);
	}

	public void addContact(Contact contact) {

		if (contacts == null) {
			contacts = new ArrayList<>();
			addContact(contact);
		} else {
			contacts.add(contact);
			Collections.sort(contacts);
		}
	}

	public Contact getContactInPostion(int postion) {

		if (contacts != null) {

			return contacts.get(postion);
		}
		return null;
	}

	public boolean removeContact(int position) {

		if (contacts != null) {

			contacts.remove(position);
			return true;
		} else
			return false;
	}

	public Contact searchContact(String name) {

		if ( name.length() == 0 || contacts == null)
			return null;

		else {
			name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
			return recursiveSearch(name, 0, contacts.size());
		}
	}

	// Implementing Divide and conquer

	public Contact recursiveSearch(String name, int start, int end) {

		int position = (end + start) / 2;

		if (contacts.get(position).getName().getFirstName().compareTo(name) == 0)
			return contacts.get(position);

		else if (position == 0 || position == contacts.size())
			return null;

		else if (name.compareTo(contacts.get(position).getName().getFirstName()) < 0)
			return recursiveSearch(name, 0, position);

		else if (name.compareTo(contacts.get(position).getName().getFirstName()) > 0)
			return recursiveSearch(name, position + 1, end - 1);

		return null;
	}

	public static void main(String[] args) {
		ContactDB contactDB = new ContactDB();

		// Adding dummy data to test
		DummyData.insert();

		String[] result = { "Aathir", "Kathir", "Shangeeth", "Test" };
		Collections.sort(contacts);
		int i = 0;
		for (Contact c : contacts) {
			Tester.compareString(result[i], c.getName().getFirstName());
			i++;
		}

		System.out.println("\n\nSearch Test\n\n");
		System.out.println(contactDB.searchContact("Test"));

	}
}
