// Java Program to Expand a String.
package firpac;

public class ExpandInputString {

	public static void main(String[] args) {
		String inputString = "a3.2B2@c3!2d?";
		int[] charCodePoints = inputString.codePoints().toArray();
		StringBuilder expandedString = new StringBuilder();
		for (int i = 0; i < charCodePoints.length; i++) {
			int currentCharCodePoint = charCodePoints[i];
			if (Character.isLetter(currentCharCodePoint) || !Character.isLetterOrDigit(currentCharCodePoint)) {
				expandedString.appendCodePoint(currentCharCodePoint);
				if (i + 1 < charCodePoints.length && Character.isDigit(charCodePoints[i + 1])) {
					int count = Character.getNumericValue(charCodePoints[i + 1]);
					expandCharacters(expandedString, currentCharCodePoint, count);
				}
			}
		}
		System.out.println(expandedString);
	}
	
	public static void expandCharacters(StringBuilder expandedString, int codePoint, int count) {
		while (count > 1) {
			expandedString.appendCodePoint(codePoint);
			count--;
		}
	}
}
