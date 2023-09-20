// Java Program to Expand a String with Character Counts.
package Firpac;

public class ExpandString {

	public static void main(String[] args) {
		String inputString = "a3.2b2@c3!2d?";
		char[] inputCharString = inputString.toCharArray();
		StringBuilder expandedString = new StringBuilder();
		for (int i = 0; i < inputCharString.length; i++) {

			if (Character.isLetter(inputCharString[i])) {
				char letter = inputCharString[i];
				expandedString.append(letter);
				if (i + 1 < inputCharString.length && Character.isDigit(inputCharString[i + 1])) {
					int count = Character.getNumericValue(inputCharString[i + 1]);
					while (count > 1) {
						expandedString.append(letter);
						count--;
					}
				}
			}
			if (!Character.isLetterOrDigit(inputCharString[i])) {
				char specialChar = inputCharString[i];
				expandedString.append(specialChar);
				if (i + 1 < inputCharString.length && Character.isDigit(inputCharString[i + 1])) {
					int count = Character.getNumericValue(inputCharString[i + 1]);
					while (count > 1) {
						expandedString.append(specialChar);
						count--;
					}
				}
			}
		}
		System.out.println(expandedString);
	}
}
