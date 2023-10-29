// Program to find the maximum value string in an array.
package firpac;

import java.util.regex.Pattern;

public class MaxValueString {

	public static void main(String[] args) {

		String[] inputStrings = { "alic3", "bob", "3", "4", "00000" };
		int maximumStringValue = findMaximumValue(inputStrings);
		System.out.println("Maximum Value String in an Array : " + maximumStringValue);
	}

	public static int findMaximumValue(String[] strings) {
		int maxValue = 0;
		for (int i = 0; i < strings.length; i++) {
			int value;
			if (Pattern.matches("^\\d+$", strings[i])) {
				value = Integer.parseInt(strings[i]);
			} else {
				value = strings[i].length();
			}
			if (value > maxValue) {
				maxValue = value;
			}
		}
		return maxValue;
	}
}
