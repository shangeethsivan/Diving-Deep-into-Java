/**
 * @author Shangeeth Sivan
 * @date 20-Mar-2017 
 * @category ZTests
 */
package com.full.stringdemo;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
interface A1{
	int a=10;
}
interface A2{
	int b=20;
}
public class Demo implements A1,A2 {

	
	public static void main(String[] args) {
		System.out.println(Math.abs(99)+"vsfsdf");
		
		
		DemoClass class1 = new DemoClass();
		class1.setName("data");
		DemoClass class2 = new DemoClass();
		class2.setName("abba");
		DemoClass class3 = new DemoClass();
		class3.setName("qwe");
		DemoClass class4 = new DemoClass();
		class4.setName("zee");
		DemoClass class5 = new DemoClass();
		class5.setName("aoo");
		ArrayList<DemoClass> data = new ArrayList<>();
		data.add(class1);
		data.add(class2);
		data.add(class3);
		data.add(class4);
		data.add(class5);
		Collections.sort(data);

		try {

			Class s = Class.forName("java.lang.String");

			String str = (String) s.newInstance();
			str = "demo";

		} catch (IllegalAccessException e) {
			
		} catch (InstantiationException e) {
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).getName());
		}

		String name = "test";
		System.out.println(name.hashCode());

		Map<String, String> map = new HashMap<String, String>();
		map.put(null, "test");

		System.out.println(map.get(null));

		String d = "test";
		Integer dint = Objects.hashCode(d);
		Scanner sn = new Scanner(System.in);
		String g = sn.nextLine();
		int n = Objects.hashCode(g);

		int a = d.hashCode();
		int b = g.hashCode();

		if (dint == n)
			System.out.println("true" + n);
		else
			System.out.println("f");
		if (a == b)
			System.out.println("true" + n);
		else
			System.out.println("f");
		

	}

}
