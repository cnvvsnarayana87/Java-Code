package firpac;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String firstString = "egg";
		String secondString = "add";

		if (firstString.length() != secondString.length()) {
			System.out.println("Two String are not Isomorphic");
		} else {
			boolean isomorphicStrings = isIsomorphicString(firstString, secondString);
			System.out.println("Given Strings are Isomorphic : " + isomorphicStrings);
		}
	}

	public static boolean isIsomorphicString(String firstString, String secondString) {
		Map<Character, Character> charMapString = new HashMap<>();

		for (int i = 0; i < firstString.length(); i++) {
			boolean values = getKeyByValue(charMapString, secondString.charAt(i)) != firstString.charAt(i);
			if (charMapString.containsKey(firstString.charAt(i))
					&& charMapString.get(firstString.charAt(i)) != secondString.charAt(i)) {
				return false;
			} else if (charMapString.containsValue(secondString.charAt(i)) && values) {
				return false;
			}
			charMapString.put(firstString.charAt(i), secondString.charAt(i));
		}
		return true;
	}

	public static Character getKeyByValue(Map<Character, Character> charMapString, Character value) {
		for (Map.Entry<Character, Character> entry : charMapString.entrySet()) {
			if (entry.getValue().equals(value)) {
				return entry.getKey();
			}
		}
		return value;
	}
}
