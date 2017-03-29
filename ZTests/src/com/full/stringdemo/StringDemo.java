/**
 * @author Shangeeth Sivan
 * @date 13-Mar-2017 
 * @category ZTests
 */
package com.full.stringdemo;

import java.util.HashMap;
import static java.lang.System.out;

public class StringDemo {
	public static void main(String[] args) {
		int one = 1;
		String color = "red";
		StringBuilder sb = new StringBuilder("hello ");
		sb.append("One=").append(one).append(", Color=").append(color).append('\n');
		System.out.print(sb);

		StringBuffer sBuffer = new StringBuffer("test");
		sBuffer.append(" String Buffer");
		System.out.println(sBuffer);

		String temp = "divi";
		String temp2 = new String("divi").intern();
		System.out.println(temp == temp2);

		HashMap<String, String> emp1 = new HashMap<>();
		emp1.put("name", "shangeeth");
		emp1.put("number", "918123198237");

		HashMap<String, String> emp2 = new HashMap<>();
		emp2.put("name", "divi");
		emp2.put("number", "1213");

		System.out.println(emp1.get("name"));
		HashMap<Integer, HashMap<String, String>> employees = new HashMap<>();
		employees.put(1, emp1);
		employees.put(2, emp2);
		

	}
}
