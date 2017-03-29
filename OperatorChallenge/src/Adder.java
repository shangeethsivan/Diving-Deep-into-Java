
/*
 *Shangeeth Sivan
 *04-Mar-2017 
 *OperatorChallenge
 */

import static java.lang.System.out;

public class Adder {

	/**
	 * Takes a integer, increments the value and returns it
	 * 
	 * @param a
	 * @return returns value of "a" after adding one
	 */
	public static int addOne(int a) {
		return ++a;
	}

	public static void main(String[] args) {
		int a = 5;
		int result = Adder.addOne(a);
		out.println(result);
	}
}
