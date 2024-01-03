package firpac;

import java.util.HashMap;
import java.util.Map;

public class StringsIsomorphic {

	public static void main(String[] args) {
		String firstString = "paper";
		String secondString = "title";

		if (firstString.length() != secondString.length()) {
			System.out.println("Given Strings are not Isomorphic");
		} else {
			boolean isomorphicStrings = isIsomorphicString(firstString, secondString);
			System.out.println("Given Strings are Isomorphic : " + isomorphicStrings);
		}
	}

	public static boolean isIsomorphicString(String firstString, String secondString) {
		Map<Character, Character> charMapFirstString = new HashMap<>();
		Map<Character, Character> charMapSecondString = new HashMap<>();

		for (int i = 0; i < firstString.length(); i++) {
			if (charMapFirstString.containsKey(firstString.charAt(i))
					&& charMapFirstString.get(firstString.charAt(i)) != secondString.charAt(i)) {
				return false;
			}
			if (charMapSecondString.containsKey(secondString.charAt(i))
					&& charMapSecondString.get(secondString.charAt(i)) != firstString.charAt(i)) {
				return false;
			}
			charMapFirstString.put(firstString.charAt(i), secondString.charAt(i));
			charMapSecondString.put(secondString.charAt(i), firstString.charAt(i));
		}
		return true;
	}
}
