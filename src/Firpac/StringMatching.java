package firpac;

import java.util.ArrayList;
import java.util.List;

public class StringMatching {

	public static void main(String[] args) {
		String[] words = { "leetcode", "et", "code" };
		List<String> matchingStrings = findMatchingStrings(words);
		System.out.println("Strings that are a substring of another word : " + matchingStrings);
	}

	public static List<String> findMatchingStrings(String[] words) {

		List<String> matchingStrings = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (i != j && words[j].indexOf(words[i]) != -1) {
					matchingStrings.add(words[i]);
					break;
				}
			}
		}
		return matchingStrings;
	}
}
