package com.full.stringconcat;

/**
 * @author Shangeeth Sivan
 * @date 09-Mar-2017
 * @category StringConcatBenchmark
 */
import static java.lang.System.out;

//References:
// String vs StringBuilder http://stackoverflow.com/a/8011440/4934236
// String buffer vs String Builder http://stackoverflow.com/questions/355089/difference-between-stringbuilder-and-stringbuffer
// https://itblackbelt.wordpress.com/2015/01/31/difference-between-string-stringbuilder-and-stringbuffer-classes-with-example-java/
public class StringConcatBenchMark {
	private static final int ITERATIONS = 10000;

	public static void main(String[] args) {

		// String Concat
		long start = System.currentTimeMillis();
		String stringText = "test";
		for (int i = 0; i < ITERATIONS; i++) {
			stringText += " test,";
		}
		long stop = System.currentTimeMillis();
		long tot_time = stop - start;
		out.println(tot_time + " ms  String + operator concat");

		// String Builder Class
		start = System.currentTimeMillis();
		StringBuilder stringBuilderText = new StringBuilder("test");
		for (int i = 0; i < ITERATIONS; i++) {
			stringBuilderText.append("test ");
		}
		stop = System.currentTimeMillis();
		tot_time = stop - start;
		out.println(tot_time + " ms  StringBuilder Append function");

		// String Buffer Class
		start = System.currentTimeMillis();
		StringBuffer stringBufferText = new StringBuffer("test");
		for (int i = 0; i < ITERATIONS; i++) {
			stringBufferText.append("test ");
		}
		stop = System.currentTimeMillis();
		tot_time = stop - start;
		out.println(tot_time + " ms  StringBuffer Append function");
	}

}
