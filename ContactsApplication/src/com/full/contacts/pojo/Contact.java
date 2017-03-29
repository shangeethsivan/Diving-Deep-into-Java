/**
 * @author Shangeeth Sivan
 * @date 14-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.pojo;

public class Contact implements Comparable<Contact> {

	private Name name;
	private PhoneNumber numbers;
	private Email email;
	private Address address;
	// TODO: have custom fields ---- private Map<String, String> customFields;

	public Contact(Name name, PhoneNumber numbers, Email email) {
		this.name = name;
		this.numbers = numbers;
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {
		return this.getName().getFirstName().equals(((Contact) obj).getName().getFirstName());
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public PhoneNumber getNumbers() {
		return numbers;
	}

	public void setNumbers(PhoneNumber numbers) {
		this.numbers = numbers;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	@Override
	public int compareTo(Contact contact) {
		return this.getName().getFirstName().compareTo(contact.getName().getFirstName());
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(name.toString());
		sb.append(numbers.toString());

		if (email != null)
			sb.append(email.toString());

		if (address != null)
			sb.append(address.toString());

		return sb.toString();
	}

}
