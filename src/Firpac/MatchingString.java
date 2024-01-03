package firpac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatchingString {

	public static void main(String[] args) {
		String[] words = { "leetcode", "et", "code" };
		List<String> matchingStrings = findMatchingStrings(words);
		System.out.println("Strings that are a substring of another word : " + matchingStrings);
	}

	public static List<String> findMatchingStrings(String[] words) {

		return Arrays.stream(words)
				.filter(firstWord -> Arrays.stream(words)
						.anyMatch(secondWord -> !firstWord.equals(secondWord) && secondWord.contains(firstWord)))
				.collect(Collectors.toList());
	}
}

