// Program to find the first letter that appears twice.
package firpac;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharacter {

	public static void main(String[] args) {

		String inputString = "abccbaacz";
		char firstRepeatedLetter = findFirstRepeatedCharacter(inputString);
		System.out.println("First Letter to Appear Twice : " + firstRepeatedLetter);
	}

	public static char findFirstRepeatedCharacter(String string) {

		Set<Character> uniqueChars = new HashSet<>();

		for (char letter : string.toCharArray()) {
			if (!uniqueChars.add(letter)) {
				return letter;
			}
		}
		return '\0';
	}
}
