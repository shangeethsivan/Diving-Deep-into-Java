
/*
 *Shangeeth Sivan
 *05-Mar-2017 
 *StringReverser
 */
import static java.lang.System.out;

public class StringReverserTester {

	/**
	 * Compares the two values of actual and expected and prints out the result
	 * 
	 * @param expected
	 *            The expected String
	 * @param actual
	 *            The actual String
	 */
	private static void checkResult(String expected, String actual) {
		String result = expected.equals(actual) ? "Passed" : "Failed";

		out.println("Expected :" + expected + "\nActual   :" + actual + "\nTest Case " + result + "\n");
	}

	public static void main(String[] args) {
		// With Recursion Tests
		out.println("*******String Reverse with Recursion Tests********");
		StringReverserWithRecursion withRecursion = new StringReverserWithRecursion();

		checkResult("naviS hteegnahS", withRecursion.reverse("Shangeeth Sivan"));
		checkResult("32190;'iopdsa", withRecursion.reverse("asdpoi';09123"));
		checkResult(":):)*&^:P:O$):):", withRecursion.reverse(":):)$O:P:^&*):):"));
		checkResult(
				"rehtegot semit emosewa fo tol a dah evah eW .htiw tuo gnah ot nosrep taerg a si eH .yob doog yrev a si magumurA ramuK hsejaR .dneirf teews ym tuoba yrots trohs A",
				withRecursion.reverse(
						" A short story about my sweet friend. Rajesh Kumar Arumugam is a very good boy. He is a great person to hang out with. We have had a lot of awesome times together"));

		out.println("*******String Reverse without Recursion Tests********");
		StringReverserWithoutRecursion withoutRecursion = new StringReverserWithoutRecursion();

		checkResult("naviS hteegnahS", withoutRecursion.reverse("Shangeeth Sivan"));
		checkResult("32190;'iopdsa", withoutRecursion.reverse("asdpoi';09123"));
		checkResult(":):)*&^:P:O$):):", withoutRecursion.reverse(":):)$O:P:^&*):):"));
		checkResult("FULL CREATIVE", withoutRecursion.reverse("EVITAERC LLUF"));
	}
}
