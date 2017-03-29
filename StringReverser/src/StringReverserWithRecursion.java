/*
 *Shangeeth Sivan
 *04-Mar-2017 
 *StringReverser
 */
public class StringReverserWithRecursion implements StringReverser {

	@Override
	public String reverse(String data) {

		String tmp = "";
		if (data.length() == 1) {
			return data;
		}
		tmp += data.charAt(data.length() - 1) + reverse(data.substring(0, data.length() - 1));
		return tmp;
	}

}
