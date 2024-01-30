// Reversal of String

package firpac;

public class ReverseString {

	public static void main(String[] args) {
		String str = "testing";
		char[] charStr = str.toCharArray();

		String reversedStr = reverseString(charStr);
		System.out.println("String after reversal : " + reversedStr);
	}

	public static String reverseString(char[] charStr) {
		int charStrLen = charStr.length;
		StringBuilder reversedString = new StringBuilder();
		for (int i = charStrLen - 1; i >= 0; i--) {
			reversedString.append(charStr[i]);
		}
		return reversedString.toString();
	}
}
