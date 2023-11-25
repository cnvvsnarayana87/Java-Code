// Program to Generate a Sorted String.
package firpac;

public class SortCharacters {

	public static void main(String[] args) {
		String inputString = "bbccdefbbaa";
		String sortedString = sortString(inputString);
		System.out.println("Sorted string is : " + sortedString);
	}

	public static String sortString(String inputString) {

		StringBuilder expectedString = new StringBuilder();
		int[] sortedCodePoints = inputString.codePoints().sorted().toArray();
		for (int number : sortedCodePoints) {
			expectedString.appendCodePoint(number);
		}
		return expectedString.toString();
	}
}
