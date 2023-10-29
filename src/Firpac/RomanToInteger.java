// Program to Convert Roman Numeral to Integer.
package firpac;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		String romanNumeral = "LVIII";
		int integerValue = findIntegerValue(romanNumeral);
		System.out.println("Integer Value : " + integerValue);
	}

	public static int findIntegerValue(String romanString) {

		Map<Character, Integer> romanIntegerMap = new HashMap<>();
		romanIntegerMap.put('I', 1);
		romanIntegerMap.put('V', 5);
		romanIntegerMap.put('X', 10);
		romanIntegerMap.put('L', 50);
		romanIntegerMap.put('C', 100);
		romanIntegerMap.put('D', 500);
		romanIntegerMap.put('M', 1000);

		int integerValue = 0;
		int stringLength = romanString.length();
		for (int i = 0; i < stringLength; i++) {
			int currentRomanValue = romanIntegerMap.get(romanString.charAt(i));
			if (i + 1 < stringLength && romanIntegerMap.get(romanString.charAt(i + 1)) > currentRomanValue) {
				integerValue -= currentRomanValue;
			} else {
				integerValue += currentRomanValue;
			}
		}
		return integerValue;
	}
}
