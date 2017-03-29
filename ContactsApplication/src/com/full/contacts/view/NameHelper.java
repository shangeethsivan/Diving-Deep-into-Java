/**
 * @author Shangeeth Sivan
 * @date 18-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.view;

import static java.lang.System.out;

import java.util.Scanner;

import com.full.contacts.pojo.Name;
import com.full.contacts.util.InstanceFactory;

public class NameHelper {

	public Name getNameFromUser(Scanner scanner) {

		Name name = InstanceFactory.getNameInstance();

		out.print("***Name***\n");

		out.println("Enter the First Name:");
		name.setFirstName(InputHelper.getStringFromUser(scanner));

		out.println("Enter the Last Name:");
		name.setLastName(InputHelper.getStringFromUser(scanner));

		return name;
	}
}
