// Program for Reversing a String.
package Firpac;

public class StringReversal {

	public static void main(String[] args) {

		String inputString = "Sunset paints the sky beautifully.";
		System.out.println("Input String    : " + inputString);
		String reversedString = reverseString(inputString);
		System.out.println("Reversed String : " + reversedString);
	}

	public static String reverseString(String input) {

		int[] originalCodePoints = input.codePoints().toArray();
		int originalLength = originalCodePoints.length - 1;

		String trimmedInput = input.replace(" ", "");
		int[] unspacedCodePoints = trimmedInput.codePoints().toArray();

		StringBuilder result = new StringBuilder();

		int j = 1;
		for (int i = 0; i <= originalLength; i++) {

			if (!Character.isSpaceChar(originalCodePoints[i])) {
				result.appendCodePoint(unspacedCodePoints[unspacedCodePoints.length - j]);
				j++;
			} else {
				result.appendCodePoint(originalCodePoints[i]);
			}
		}
		return result.toString();
	}
}
