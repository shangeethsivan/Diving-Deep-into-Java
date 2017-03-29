/**
 * @author Shangeeth Sivan
 * @date 14-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.pojo;



/**
 * Storing the name in a separate entity - FirstName , LastName,Phonetic
 * name,Initial
 * 
 * @author Shangeeth Sivan
 *
 */
public class Name {

	private String firstName;
	private String lastName;
	private String initials;
	private String phoneticName;

	public void setFirstName(String firstName) {
		// Setting First Name to capital letter
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public void setPhoneticName(String phoneticName) {
		this.phoneticName = phoneticName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getInitials() {
		return initials;
	}

	public String getPhoneticName() {
		return phoneticName;
	}

	@Override
	public String toString() {
		return "***Name : \nFirstName:" + firstName + ",  LastName:" + lastName + "  Initials:" + initials
				+ ",  PhoneticName:" + phoneticName;
	}

}
