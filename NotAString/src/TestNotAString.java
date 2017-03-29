
/*
 *Shangeeth Sivan
 *04-Mar-2017 
 *NotAString
 */
import static java.lang.System.out;

public class TestNotAString {

	/**
	 * Compares the two parameters passed and prints "Case Pass" if they equal
	 * and prints "Case Failed" if they are not equal
	 * 
	 * @param expected
	 *            Expected result
	 * @param actual
	 *            Actual result
	 */
	public static void checkResult(String expected, String actual) {
		String resultString = expected.equals(actual) ? "Passed" : "Failed";
		out.println("Expected: " + expected + "\nActual:   " + actual + "\nTest Case " + resultString + "\n");
	}

	public static void main(String[] args) {

		NotAString ns = new NotAString();

		// test1 - not going to happen
		checkResult("not going to happen", ns.notAString("going to happen"));

		// test2 - not a
		checkResult("not a", ns.notAString("a"));

		// Inputs Already containing Not

		// test3 -not interested
		checkResult("not interested", ns.notAString("not interested"));

		// test4 -not in the game
		checkResult("not in the game", ns.notAString("not in the game"));

		// test5 -not at all
		checkResult("not at all", ns.notAString("not at all"));
	}
}
