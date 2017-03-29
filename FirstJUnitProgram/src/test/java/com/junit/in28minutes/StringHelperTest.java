/**
 * @author Shangeeth Sivan
 * @date 21-Mar-2017 
 * @category FirstJUnitProgram
 */
package com.junit.in28minutes;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void testTruncateAInFirst2Positions() {

		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

}
