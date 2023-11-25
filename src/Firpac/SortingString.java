// Program to Generate a Sorted String.
package firpac;

public class SortingString {

	public static void main(String[] args) {
		String inputString = "bBLm3PZe@B8f6A1aza";
		if (inputString.isEmpty() || sortString(inputString).length() == 0) {
			System.out.println("Input doesn't meet requirements");
		} else {
			System.out.println("Sorted string is: " + sortString(inputString));
		}
	}
	
	public static String sortString(String inputString) {
		StringBuilder expectedString = new StringBuilder();
		StringBuilder uppercaseString = new StringBuilder();
		StringBuilder digitString = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < inputString.length(); j++) {
				if ('a' + i == inputString.codePointAt(j)) {
					expectedString.appendCodePoint('a' + i);
				} else if ('A' + i == inputString.codePointAt(j)) {
					uppercaseString.appendCodePoint('A' + i);
				} else if ('0' + i == inputString.codePointAt(j) && Character.isDigit(inputString.codePointAt(j))) {
					digitString.appendCodePoint('0' + i);
				}
			}
		}
		expectedString.append(uppercaseString);
		expectedString.append(digitString);
		return expectedString.toString();
	}
}
