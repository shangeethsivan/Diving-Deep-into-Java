import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

/**
 * @author Shangeeth Sivan
 * @date 25-Mar-2017
 * @category NearHundred
 */

@RunWith(Parameterized.class)
public class TestNearHundredTrueConditions {

	private int input;

	public TestNearHundredTrueConditions(int input) {
		this.input = input;
	}

	@Parameters
	public static Collection<Integer[]> testConditons() {
		return Arrays.asList(new Integer[][]  {{110},{101},{203},{102}} );
	}
	
	@Test
	public void test() {
		assertTrue(NearHundredVerifier.nearHundred(input));
	}

}
