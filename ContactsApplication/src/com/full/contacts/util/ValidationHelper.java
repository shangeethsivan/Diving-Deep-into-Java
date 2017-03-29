/**
 * @author Shangeeth Sivan
 * @date 20-Mar-2017 
 * @category ContactsApplication
 */
package com.full.contacts.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.full.tester.Tester;

public class ValidationHelper {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public static final Pattern VALID_NUMBER_REGEX = Pattern.compile("^((\\+|00)(\\d{1,3})[\\s-]?)?(\\d{10})$",
			Pattern.CASE_INSENSITIVE);

	public static final Pattern VALID_PINCODE_REGEX = Pattern.compile("^[1-9][0-9]{5}$", Pattern.CASE_INSENSITIVE);

	public static boolean validateEmail(String emailId) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailId);
		return matcher.find();
	}

	public static boolean validateMobileNumber(String number) {
		Matcher matcher = VALID_NUMBER_REGEX.matcher(number);
		return matcher.find();
	}

	public static boolean validatePincode(int number) {
		Matcher matcher = VALID_PINCODE_REGEX.matcher(String.valueOf(number));
		return matcher.find();
	}

	public static void main(String[] args) {
		Tester.compareBoolean(validatePincode(606601), true);

		Tester.compareBoolean(validateMobileNumber("+19159816148"), true);
		Tester.compareBoolean(validateEmail("shangeeth95@gmail.com"), true);

		Tester.compareBoolean(validateEmail("@__gmail.com"), false);
	}
}
