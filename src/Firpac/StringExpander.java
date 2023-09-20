// Java Program to Expand a String with Character Counts.
package Firpac;

public class StringExpander {

	public static void main(String[] args) {
		String inputString = "a3.2b2@c3!2d?";
		char[] inputCharString = inputString.toCharArray();
		StringBuilder expandedString = new StringBuilder();
		for (int i = 0; i < inputCharString.length; i++) {
			char currentChar = inputCharString[i];
			if (Character.isLetter(currentChar) || !Character.isLetterOrDigit(currentChar)) {
				expandedString.append(currentChar);
				if (i + 1 < inputCharString.length && Character.isDigit(inputCharString[i + 1])) {
					int count = Character.getNumericValue(inputCharString[i + 1]);
					expandCharacters(expandedString, currentChar, count);
				}
			}
		}
		System.out.println(expandedString);
	}

	public static void expandCharacters(StringBuilder expandedString, char character, int count) {
		while (count > 1) {
			expandedString.append(character);
			count--;
		}
	}
}
