/**
 * @author Shangeeth Sivan
 * @date 14-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.view;

import static java.lang.System.out;

import java.util.List;

import com.full.contacts.pojo.Contact;

public class PrintHelper {

	public static void showMainMenu() {

		out.println("\t***Contacts Application***\n");
		out.println("\t-----------Menu-----------");
		out.println("\t   1. Add a new Contact \n\t   2. Search\n\t   3. View All Contacts\n\t   4. Exit Application");

		printChoiceMessage();
	}

	public static void newContactMenu() {

		out.println("Please Select from the following options to add other details");
		out.println("1. Add Email");
		out.println("2. Add Address");
		out.println("3. Save the Contact");

		printChoiceMessage();
	}

	public static void contactDetailMenu() {
		out.println("Please Select from the following options to add other details");
		out.println("1. Edit the Contact");
		out.println("2. Delete Contact");
		out.println("0. Goto Main Menu");

		printChoiceMessage();
	}

	public static void editContactMenu(Contact contact) {
		out.println("Please Select from the following options to add other details");
		out.println("1. Edit Name");
		out.println("2. Edit Number");

		if (contact.getEmail() == null)
			out.println("3. Add Email");
		else
			out.println("3. Edit Email");
		out.println("0. Goto Main Menu");

		printChoiceMessage();
	}

	private static void printChoiceMessage() {
		out.println("Please enter your choice:");
	}

	public static void showImpMessageToUser(String message) {

		int starLength = message.length() + 10;

		for (int i = 0; i <= starLength; i++) {
			out.print("*");
		}
		out.println("\n*****" + message + "*****");

		for (int i = 0; i <= starLength; i++) {
			out.print("*");
		}
		out.println();
	}

	public static void showDataToUser(String message) {
		out.println("\n" + message);
	}

	public static void printContactName(List<String> names) {

		StringBuilder builder = new StringBuilder();

		for (int i = 1; i < names.size() + 1; i++) {
			builder.append(i + ". " + names.get(i - 1) + "\n");
		}

		System.out.println(builder.toString());
	}

	/*
	 * 
	 * Testing MenuDisplayHelper
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		showMainMenu();

	}
}
