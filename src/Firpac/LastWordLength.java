package firpac;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastWordLength {

	public static void main(String[] args) {
		String inputString = "   fly me   to   the moon   ";

		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(inputString);

		String lastWord = null;
		while (matcher.find()) {
			lastWord = matcher.group();
		}

		int length = 0;
		if (lastWord != null) {
			length = lastWord.length();
		}
		System.out.println("Last Word Length: " + length);
	}
}
