// Program to find the maximum value string in an array.
package firpac;

import java.util.Arrays;

public class MaximumValueString {

	public static void main(String[] args) {

		String[] inputStrings = { "alic3","bob","3","4","00000" };
		int maximumStringValue = findMaximumValue(inputStrings);
		System.out.println("Maximum Value String in an Array : " + maximumStringValue);
	}

	public static int findMaximumValue(String[] strings) {

		int[] valuesOfStrings = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			String currentString = strings[i].replaceAll("\\d", "");
			if (currentString.isEmpty()) {
				valuesOfStrings[i] = Integer.parseInt(strings[i]);
			} else {
				valuesOfStrings[i] = strings[i].length();
			}
		}
		int maxValue = Arrays.stream(valuesOfStrings).max().getAsInt();
		return maxValue;
	}
}
