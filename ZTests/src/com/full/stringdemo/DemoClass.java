/**
 * @author Shangeeth Sivan
 * @date 20-Mar-2017 
 * @category ZTests
 */
package com.full.stringdemo;

class DemoClass implements Comparable<DemoClass> {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(DemoClass o) {
		return this.name.compareTo(o.getName());
	}

}
