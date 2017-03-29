package com.full.multiplechecker;

import com.full.tester.Tester;

/*
 *Shangeeth Sivan
 *05-Mar-2017 
 *Multpleof3or5
 */
public class MultipleOf3Or5Only {
	{
		System.out.println("asd");
	}

	public Boolean multipleOf3Or5Only(int value) {
		if (value % 3 == 0 && value % 5 == 0) {
			return false;
		} else if (value % 3 == 0 || value % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Testing All cases
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		MultipleOf3Or5Only mObject = new MultipleOf3Or5Only();

		// test cases given in Adaptive U
		Tester.compareBoolean(true, mObject.multipleOf3Or5Only(25));
		Tester.compareBoolean(false, mObject.multipleOf3Or5Only(26));
		Tester.compareBoolean(false, mObject.multipleOf3Or5Only(15));
		Tester.compareBoolean(true, mObject.multipleOf3Or5Only(6));

		Tester.compareBoolean(true, mObject.multipleOf3Or5Only(500));
		Tester.compareBoolean(false, mObject.multipleOf3Or5Only(30));
		Tester.compareBoolean(false, mObject.multipleOf3Or5Only(60));
		Tester.compareBoolean(false, mObject.multipleOf3Or5Only(90000));
		Tester.compareBoolean(false, mObject.multipleOf3Or5Only(889));
		Tester.compareBoolean(true, mObject.multipleOf3Or5Only(999993339));
	}
}
