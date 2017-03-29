
/*
 *Shangeeth Sivan
 *04-Mar-2017 
 *StringReverser
 */

import static java.lang.System.out;

public class TimingCodeTester {
	public static final int NUM_ITERATIONS = 10000;

	public static void runTimingTest(StringReverser reverser) {

		String result = "";
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < NUM_ITERATIONS; i++) {
			result = reverser.reverse("Shangeeth Sivan");
		}

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		out.println("Total runtime: " + totalTime + "ms");
		out.println(result);
	}

	public static void main(String[] args) {
		out.println("Without Recursion");
		runTimingTest(new StringReverserWithoutRecursion());

		out.println("\nReverse With Recursion");
		runTimingTest(new StringReverserWithRecursion());
	}
}
