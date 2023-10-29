// Program to find the maximum value string in an array.
package firpac;

import java.util.Arrays;
import java.util.regex.Pattern;

public class HighValueString {

	public static void main(String[] args) {

		String[] inputStrings = { "alic3", "bob", "3", "4", "00000" };
		int maximumStringValue = findMaximumValue(inputStrings);
		System.out.println("Maximum Value String in an Array : " + maximumStringValue);
	}

	public static int findMaximumValue(String[] strings) {
		return Arrays.stream(strings).mapToInt(s -> Pattern.matches("^\\d+$", s) ? Integer.parseInt(s) : s.length())
				.max().getAsInt();

	}
}
