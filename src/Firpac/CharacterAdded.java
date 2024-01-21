package firpac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterAdded {

	public static void main(String[] args) {
		String originalString = "abc";
		String modifiedString = "abcde";
		List<Character> addedLetter = findAddedLetter(originalString, modifiedString);
		System.out.println("Letter that was added to secondString : " + addedLetter);
	}

	public static List<Character> findAddedLetter(String originalString, String modifiedString) {

		Map<Character, Integer> characterCount = new HashMap<>();
		for (char character : modifiedString.toCharArray()) {
			characterCount.put(character, characterCount.getOrDefault(character, 0) + 1);
		}
		for (char character : originalString.toCharArray()) {
			characterCount.put(character, characterCount.get(character) - 1);
		}
		List<Character> addedCharacters = new ArrayList<>();
		for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
			if (entry.getValue() > 0) {
				addedCharacters.add(entry.getKey());
			}
		}
		return addedCharacters;
	}
}
