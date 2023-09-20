// Program to find non-repetitive characters in a string using HashMap.
package Firpac;

import java.util.HashMap;
import java.util.Map;

public class NonRepHMap {

	public static void main(String[] args) {

		String inputString = "Sunset glow on the horizon";
		String lowerCaseString = inputString.toLowerCase();
		char[] charArray = lowerCaseString.replace(" ", "").toCharArray();
		StringBuilder nonRepetitiveChars = new StringBuilder();
		Map<Character, Integer> charFrequencyMap = new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			if (charFrequencyMap.containsKey(charArray[i])) {
				charFrequencyMap.put(charArray[i], charFrequencyMap.get(charArray[i]) + 1);
			} else {
				charFrequencyMap.put(charArray[i], 1);
			}
		}
		for (char c : charArray) {
			if (charFrequencyMap.get(c) == 1) {
				nonRepetitiveChars.append(c);
			}
		}
		String spacedNonRepetitiveChars = nonRepetitiveChars.toString().replace("", " ");
		System.out.println("Non-repetitive characters in the string: " + spacedNonRepetitiveChars);
	}
}
