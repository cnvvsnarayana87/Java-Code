// Program to Find the Longest Common Prefix
package firpac;

import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {

		String[] words = { "flower", "flow", "flight" };
		StringBuilder commonPrefix = new StringBuilder();

		String shortestWord = Arrays.stream(words)
				.min((firstWord, secondWord) -> Integer.compare(firstWord.length(), secondWord.length())).orElse(null);

		for (int i = 0; i < shortestWord.length(); i++) {
			final int j = i;
			char currentChar = shortestWord.charAt(j);
			if (Arrays.stream(words).allMatch(word -> word.charAt(j) == currentChar)) {
				commonPrefix.append(currentChar);
			} else {
				break;
			}
		}
		if (commonPrefix.length() > 0) {
			System.out.println("Common prefix : " + commonPrefix);
		} else {
			System.out.println("No common prefix");
		}
	}
}
