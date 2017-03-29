/*
 *Shangeeth Sivan
 *04-Mar-2017 
 *IsOneOrSum
 */
public class OneOrSumTen {

	/**
	 * This Function returns true if any one argument is 10 or checks if the sum
	 * of the two numbers is 10
	 * 
	 * @param num1
	 * @param num2
	 * @return A Boolean value based on the condition
	 */

	public static Boolean isOneOrSumTen(int num1, int num2) {
		int expected = 10;

		if (num1 == expected || num2 == expected) {
			return true;
		} else if (num1 + num2 == expected) {
			return true;
		} else {
			return false;
		}

	}

}
