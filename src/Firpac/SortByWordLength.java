package firpac;

import java.util.HashMap;
import java.util.Map;

public class SortByWordLength {

	public static void main(String[] args) {
		String inputString = "Hi all have a nice day";
		String sortedString = sortStringByWordLength(inputString);
		System.out.println("String after sorting by length of words : " + sortedString.trim());
	}

	public static String sortStringByWordLength(String inputString) {

		String[] words = inputString.split(" ");
		Map<String, Integer> wordsLengthMap = new HashMap<>();
		int[] wordsLength = new int[words.length];

		for (int i = 0; i < words.length; i++) {
			wordsLengthMap.put(words[i], words[i].length());
			wordsLength[i] = words[i].length();
		}

		for (int i = 0; i < wordsLength.length - 1; i++) {
			for (int j = 0; j < wordsLength.length - i - 1; j++) {
				if (wordsLength[j] > wordsLength[j + 1]) {
					int temp = wordsLength[j];
					wordsLength[j] = wordsLength[j + 1];
					wordsLength[j + 1] = temp;
				}
			}
		}

		String expectedString = "";
		for (int i = 0; i < wordsLength.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (wordsLength[i] == wordsLengthMap.get(words[j])) {
					expectedString = expectedString + " " + words[j];
					wordsLengthMap.put(words[j], 0);
					break;
				}
			}
		}
		return expectedString;
	}
}
