/**
 * @author Shangeeth Sivan
 * @date 30-Mar-2017 
 * @category PosNegWeb
 */
package com.full.webapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class PosNegTester {

	@Test
	public void test() {
	//	System.out.println(PosNeg.posNeg(1, 2, true));
		assertFalse(PosNeg.posNeg(1, 2, true));
	}

}
