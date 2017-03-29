/**
 * @author Shangeeth Sivan
 * @date 14-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.pojo;

import static java.lang.System.out;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Email {

	private Map<String, String> emails;

	public Map<String, String> getEmails() {
		return emails;
	}

	public void setEmails(Map<String, String> otherEmails) {
		this.emails = otherEmails;
	}

	public void addEmail(String label, String emailId) {
		if (emails != null) {
			emails.put(label, emailId);
		} else {
			emails = new HashMap<>();
			addEmail(label, emailId);
		}
	}

	@Override
	public String toString() {

		if (emails != null) {
			StringBuilder stringBuilder = new StringBuilder("\n***Email :");

			for (Map.Entry<String, String> email : emails.entrySet()) {
				stringBuilder.append("\n" + email.getKey() + ":");
				stringBuilder.append(email.getValue());
			}

			return stringBuilder.toString();
		} else
			return "Email is empty - Edit the contact to add Email";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Email email = new Email();
		email.addEmail("test", "shangeeth95@gmail.com");
		email.addEmail("test2", "shivthepro@gmail.com");
		out.println(email.toString());
		scanner.close();
	}
}
