// Find a count of each character in a given String.
package firpac;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		String inputString = "Automation Testing";
		Map<Character, Integer> charCountMap = getCharacterCount(inputString);
		System.out.println(charCountMap);
	}

	public static Map<Character, Integer> getCharacterCount(String inputString) {
		int charCount;
		String noSpaceString = inputString.replace(" ", "");
		String lowerCaseString = noSpaceString.toLowerCase();
		char[] charArray = lowerCaseString.toCharArray();
		Map<Character, Integer> charCountMap = new HashMap<>();

		for (int i = 0; i < charArray.length; i++) {
			charCount = 0;
			for (int j = 0; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					charCount++;
				}
			}
			charCountMap.put(charArray[i], charCount);
		}
		return charCountMap;
	}
}
