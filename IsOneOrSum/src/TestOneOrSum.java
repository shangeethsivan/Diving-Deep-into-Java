
/*
 *Shangeeth Sivan
 *04-Mar-2017 
 *IsOneOrSum
 */
import static java.lang.System.out;

public class TestOneOrSum {

	/**
	 * Compares the two parameters passed and prints "Case Pass" if they equal
	 * and prints "Case Failed" if they are not equal
	 * 
	 * @param expected
	 *            Expected result
	 * @param result
	 *            Actual result
	 */
	public static void checkResult(Boolean expected, Boolean result) {
		String resultString = expected == result ? "Passed" : "Failed";
		out.println("Test Case " + resultString + "\n");
	}

	public static void main(String[] args) {

		System.out.println("Input 9 10 Expected :true");
		checkResult(true, OneOrSumTen.isOneOrSumTen(9, 10));

		System.out.println("Input 10000 244 Expected :false");
		checkResult(false, OneOrSumTen.isOneOrSumTen(10000, 244));

		System.out.println("Input - 2147483638 214748348 Expected :true");
		checkResult(true, OneOrSumTen.isOneOrSumTen(-2147483627, 2147483637));

		System.out.println("Input -5 6 Expected :false");
		checkResult(false, OneOrSumTen.isOneOrSumTen(-5, 6));

		System.out.println("Input 2147483647 -2147483637 Expected :true");
		checkResult(true, OneOrSumTen.isOneOrSumTen(2147483647, -2147483637));
	}
}
