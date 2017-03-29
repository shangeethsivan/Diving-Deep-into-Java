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
public class TestNearHundredFalseConditions {

	private int input;

	public TestNearHundredFalseConditions(int input) {
		this.input = input;
	}

	@Parameters
	public static Collection<Integer[]> testConditons() {
		return Arrays.asList(new Integer[][]  {{111},{1123},{300},{250}} ); // input int
																// boolean
	}
	
	@Test
	public void test() {
		assertFalse(NearHundredVerifier.nearHundred(input));
	}

}
