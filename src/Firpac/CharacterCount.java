// Program to Count the Characters in a String.
package firpac;

public class CharacterCount {

	public static void main(String[] args) {

		String inputString = "aabbbccccd";
		String characterCount = countCharacters(inputString);
		System.out.println("Characters and Their Counts: " + characterCount);
	}

	public static String countCharacters(String inputString) {

		int[] inputCodePoints = inputString.codePoints().toArray();
		StringBuilder characterCountBuilder = new StringBuilder();

		int count = 0;
		for (int i = 0; i < inputCodePoints.length; i++) {
			if (count == 0) {
				characterCountBuilder.appendCodePoint(inputCodePoints[i]);
			}
			if (i + 1 < inputCodePoints.length && inputCodePoints[i] != inputCodePoints[i + 1]) {
				count++;
				characterCountBuilder.append(count);
				count = 0;
			} else {
				count++;
			}
		}
		characterCountBuilder.append(count);
		return characterCountBuilder.toString();
	}
}
