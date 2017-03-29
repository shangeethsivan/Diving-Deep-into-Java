/*
 *Shangeeth Sivan
 *04-Mar-2017 
 *NotAString
 */
public class NotAString {

	/**
	 * Appends the word "not" with the input String and returns it
	 * 
	 * @param text
	 * @return
	 */
	public String notAString(String text) {
		String resultText = "";
		if (text.length() >= 3) {
			if ("not".equalsIgnoreCase(text.substring(0, 3))) {
				resultText = text;
			} else {
				resultText = "not " + text;
			}
		} else {
			resultText = "not " + text;
		}
		return resultText;
	}
}
