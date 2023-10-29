// Program to find the first letter that appears twice.
package firpac;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {

		String inputString = "abccbaacz";
		char firstRepeatedLetter = findRepeatedCharacter(inputString);
		System.out.println("First Letter to Appear Twice : " + firstRepeatedLetter);
	}

	public static char findRepeatedCharacter(String string) {

		int[] codePoints = string.codePoints().toArray();
		Set<Integer> uniqueCodePoints = new HashSet<>();

		for (int i = 0; i < codePoints.length; i++) {
			uniqueCodePoints.add(codePoints[i]);
			if (i + 1 < codePoints.length && uniqueCodePoints.contains(codePoints[i + 1])) {
				return (char) codePoints[i + 1];
			}
		}
		return '\0';
	}
}
