package firpac;

public class LetterAdded {

	public static void main(String[] args) {
		String originalString = "a";
		String modifiedString = "aa";
		char addedLetter = findAddedLetter(originalString, modifiedString);
		System.out.println("Letter that was added to secondString : " + addedLetter);
	}

	public static char findAddedLetter(String originalString, String modifiedString) {

		int sumOfOriginalString = originalString.codePoints().sum();
		int sumOfModifiedString = modifiedString.codePoints().sum();
		int difference = sumOfModifiedString - sumOfOriginalString;
		return (char) difference;
	}
}
