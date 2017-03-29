/*
 *Shangeeth Sivan
 *04-Mar-2017 
 *StringReverser
 */
public class StringReverserWithoutRecursion implements StringReverser {

	@Override
	public String reverse(String data) {

		char[] charArray = data.toCharArray();
		int charArrSize = charArray.length;
		char[] reversedCharArray = new char[charArrSize];

		for (int i = charArrSize - 1; i >= 0; i--) {
			reversedCharArray[i] = charArray[charArrSize - 1 - i];
			// System.out.println(temporaryCharArray[(size-1)-i]);
		}
		return String.valueOf(reversedCharArray);
	}

}
