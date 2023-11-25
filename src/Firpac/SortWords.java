// Program to Sort Words of a String.
package firpac;

import java.util.Arrays;

public class SortWords {

	public static void main(String[] args) {

		String inputString = "It's not the load that breaks you down, it's the way you carry it.";
		String[] words = inputString.split(" ");
		StringBuilder sortedString = new StringBuilder();
		for (String word : words) {
			char[] sortedWord = word.toCharArray();
			Arrays.sort(sortedWord);
			sortedString.append(new String(sortedWord) + " ");
		}
		System.out.println(sortedString);
	}
}
