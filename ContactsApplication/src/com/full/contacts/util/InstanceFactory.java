/**
 * @author Shangeeth Sivan
 * @date 20-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.util;

import com.full.contacts.pojo.Address;
import com.full.contacts.pojo.Contact;
import com.full.contacts.pojo.Email;
import com.full.contacts.pojo.Name;
import com.full.contacts.pojo.PhoneNumber;

public class InstanceFactory {

	public static Name getNameInstance() {
		return new Name();
	}

	public static Email getEmailInstance() {
		return new Email();
	}

	public static Address getAddressInstance() {
		return new Address();
	}

	public static PhoneNumber getPhoneNumberInstance() {
		return new PhoneNumber();
	}

	public static Contact getContactInstance(Name name, PhoneNumber number, Email email) {
		return new Contact(name, number, email);
	}
}
