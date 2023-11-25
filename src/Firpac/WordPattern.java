// Program to check if the given string follows the specified pattern.
package firpac;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "abba";
		String inputString = "dog cat cat dog";

		char[] patternArray = pattern.toCharArray();
		String[] wordsArray = inputString.split(" ");
		if (patternArray.length == wordsArray.length) {
			System.out.println("Word pattern matches : " + checkPattern(patternArray, wordsArray));
		} else {
			System.out.println("Word pattern doesn't match ");
		}
	}

	public static boolean checkPattern(char[] patternArray, String[] wordsArray) {

		Map<Character, String> charToString = new HashMap<>();
		Map<String, Character> stringToChar = new HashMap<>();
		for (int i = 0; i < patternArray.length; i++) {
			if (!charToString.containsKey(patternArray[i])) {
				charToString.put(patternArray[i], wordsArray[i]);
			} else if (!charToString.get(patternArray[i]).equals(wordsArray[i])) {
				return false;
			}
			if (!stringToChar.containsKey(wordsArray[i])) {
				stringToChar.put(wordsArray[i], patternArray[i]);
			} else if (stringToChar.get(wordsArray[i]) != patternArray[i]) {
				return false;
			}
		}
		return true;
	}
}
