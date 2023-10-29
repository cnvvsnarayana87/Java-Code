// Program to Find the Maximum Number of String Pairs.
package firpac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringPairs {

	public static void main(String[] args) {

		String[] words = { "cd", "ac", "dc", "ca", "zz" };

		Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

		int count = 0;
		for (int i = 0; i < words.length; i++) {
			String currentWord = words[i];
			uniqueWords.remove(currentWord);
			String reversedWord = new StringBuilder(currentWord).reverse().toString();

			if (uniqueWords.contains(reversedWord)) {
				count++;
			}
		}
		System.out.println("Maximum Number of String Pairs : " + count);
	}
}
