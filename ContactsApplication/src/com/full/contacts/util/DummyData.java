/**
 * @author Shangeeth Sivan
 * @date 23-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.util;

import com.full.contacts.model.ContactDB;
import com.full.contacts.pojo.Contact;
import com.full.contacts.pojo.Name;
import com.full.contacts.pojo.PhoneNumber;

public class DummyData {

	public static void insert() {

		PhoneNumber number = new PhoneNumber();
		number.addNumber("Home", "22342324L");
		number.addNumber("Home", "244342324L");
		number.addNumber("Work", "244342324L");

		Name name = new Name();
		name.setFirstName("Test");
		name.setLastName("Dummy");

		Name name2 = new Name();
		name2.setFirstName("Kathir");

		Name name3 = new Name();
		name3.setFirstName("Aathir");

		Name name4 = new Name();
		name4.setFirstName("Shangeeth");

		ContactDB contactDB = new ContactDB();

		contactDB.addContact(new Contact(name, number, null));
		contactDB.addContact(new Contact(name2, number, null));
		contactDB.addContact(new Contact(name3, number, null));
		contactDB.addContact(new Contact(name4, number, null));

	}
}
