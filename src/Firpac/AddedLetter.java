package firpac;

public class AddedLetter {

	public static void main(String[] args) {
		String originalString = "abcde";//"ahbl";
		String modifiedString = "dbeacfx";//"alhbu";
		char addedLetter = findAddedLetter(originalString, modifiedString);
		System.out.println("Letter that was added to secondString : " + addedLetter);
	}

	public static char findAddedLetter(String originalString, String modifiedString) {

		int sumOfOriginalString = 0;
		int sumOfModifiedString = 0;

		for (int i = 0; i < modifiedString.length(); i++) {
			if (i < originalString.length()) {
				int tempOriginal = originalString.charAt(i);
				sumOfOriginalString = sumOfOriginalString + tempOriginal;
			}
			if (i < modifiedString.length()) {
				int tempModified = modifiedString.charAt(i);
				sumOfModifiedString = sumOfModifiedString + tempModified;
			}
		}
		int difference = sumOfModifiedString - sumOfOriginalString;
		return (char) difference;
	}
}
