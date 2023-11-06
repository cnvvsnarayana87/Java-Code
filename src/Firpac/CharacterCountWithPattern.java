// Program to Count the Characters in a String.
package firpac;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterCountWithPattern {

	public static void main(String[] args) {
		String inputString = "aabbbccccd";
		String characterCount = countCharacters(inputString);
		System.out.println("Characters and Their Counts: " + characterCount);
	}

	public static String countCharacters(String inputString) {

		StringBuilder characterCountBuilder = new StringBuilder();
		Pattern pattern = Pattern.compile("(.)(\\1*)");
		Matcher matcher = pattern.matcher(inputString);

		while (matcher.find()) {
			char character = matcher.group(1).charAt(0);
			int count = matcher.group(2).length() + 1;
			characterCountBuilder.append(character).append(count);
		}

		return characterCountBuilder.toString();
	}
}
