package firpac;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortSentenceByCount {

	public static void main(String[] args) {
		String inputString = "Hi all have a nice day";
		String sortedString = sortStringByWordLength(inputString);
		System.out.println(sortedString.trim());
	}

	public static String sortStringByWordLength(String inputString) {

		String[] words = inputString.split(" ");
		StringBuilder expectedString = new StringBuilder();
		List<String> wordsList = new LinkedList<>();

		for (String word : words) {
			wordsList.add(word);
		}

		Collections.sort(wordsList, Comparator.comparingInt(String::length));

		for (String word : wordsList) {
			expectedString.append(word + " ");
		}
		return expectedString.toString();
	}
}
