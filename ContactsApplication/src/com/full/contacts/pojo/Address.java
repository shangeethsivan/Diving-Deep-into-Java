/**
 * @author Shangeeth Sivan
 * @date 23-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.pojo;

public class Address {

	private String streetAddress;
	private String city;

	private int pincode;

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("***Address");
		sb.append(streetAddress + "," + city + "," + pincode);
		return sb.toString();
	}

}
