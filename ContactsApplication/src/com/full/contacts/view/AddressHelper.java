/**
 * @author Shangeeth Sivan
 * @date 23-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.view;

import java.util.Scanner;

import com.full.contacts.pojo.Address;
import com.full.contacts.util.InstanceFactory;
import com.full.contacts.util.ValidationHelper;

public class AddressHelper {

	public Address getAddressFromUser(Scanner scanner) {

		Address address = InstanceFactory.getAddressInstance();

		PrintHelper.showDataToUser("***Address");

		PrintHelper.showDataToUser("Please Enter all the details that follows");
		PrintHelper.showDataToUser("1.Door No and street Name \n2.Enter City \n3.Pincode");

		PrintHelper.showDataToUser("Enter the Door No and steet Name:");
		address.setStreetAddress(InputHelper.getStringFromUser(scanner));

		PrintHelper.showDataToUser("\nEnter the City");
		address.setCity(InputHelper.getStringFromUser(scanner));

		boolean validPin = true;

		do {
			PrintHelper.showDataToUser("Enter the Pincode");

			if (!validPin)
				PrintHelper.showDataToUser("Enter a valid Pin");

			validPin = false;

			int pincode = InputHelper.getIntegerFromUser(scanner);

			if (ValidationHelper.validatePincode(pincode)) {
				validPin = true;
				address.setPincode(pincode);
			}

		} while (!validPin);

		return address;
	}

	/**
	 * Test
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Address address = new AddressHelper().getAddressFromUser(scanner);
		System.out.println(address.toString());
	}

}
