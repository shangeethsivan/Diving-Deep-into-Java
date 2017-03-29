/**
 * @author Shangeeth Sivan
 * @date 25-Mar-2017
 * @category NearHundred
 */
public class NearHundredVerifier {

	public static boolean nearHundred(int a) {

		int checkNear100 = Math.abs(100 - a);
		int checkNear200 = Math.abs(200 - a);

		if (checkNear100 <= 10 || checkNear200 <= 10)
			return true;

		return false;
	}

}
