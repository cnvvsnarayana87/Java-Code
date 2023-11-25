// Program to minimize the string.
package firpac;

import java.util.stream.Collectors;

public class MinimizeString {

	public static void main(String[] args) {

		String inputString = "aaabc";
		String minimumLength = minimizedStringLength(inputString);
		System.out.println("Minimized string : " + minimumLength);
	}

	public static String minimizedStringLength(String inputString) {
		String minimizedString = inputString.chars().distinct().mapToObj(ch -> String.valueOf((char) ch))
				.collect(Collectors.joining());
		return minimizedString;
	}
}
