package firpac;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		String firstString = "anagram";
		String secondString = "nagaram";
		boolean isAnagram = isAnagram(firstString, secondString);
		System.out.println("Second string is an anagram of the first string : " + isAnagram);
	}

	public static boolean isAnagram(String firstString, String secondString) {

		if (firstString.length() != secondString.length()) {
			return false;
		}

		Map<Character, Integer> characterFrequency = new HashMap<>();
		for (int i = 0; i < firstString.length(); i++) {
			char charFirst = firstString.charAt(i);
			char charSecond = secondString.charAt(i);
			characterFrequency.put(charFirst, characterFrequency.getOrDefault(charFirst, 0) + 1);
			characterFrequency.put(charSecond, characterFrequency.getOrDefault(charSecond, 0) - 1);
		}

		for (char ch : characterFrequency.keySet()) {
			if (characterFrequency.get(ch) != 0) {
				return false;
			}
		}
		return true;
	}
}
