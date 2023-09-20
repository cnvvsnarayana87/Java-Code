// Program to Find the Largest Substring without repeated characters.
package Firpac;

import java.util.ArrayList;
import java.util.List;

public class LargeSubstring {

	public static void main(String[] args) {
		String inputString = "xyzabbcdefgghbe";
		char[] inputStringArray = inputString.toCharArray();
		StringBuilder largeSubstring = new StringBuilder();
		StringBuilder finalLargeSubstring = new StringBuilder();
		List<Character> substringList = new ArrayList<>();

		for (int i = 0; i < inputStringArray.length; i++) {

			if (substringList.contains(inputStringArray[i])) {
				if (largeSubstring.length() > finalLargeSubstring.length()) {
					finalLargeSubstring.setLength(0);
					finalLargeSubstring.append(largeSubstring);
					substringList.clear();
					largeSubstring.setLength(0);
				} else if (largeSubstring.length() < finalLargeSubstring.length()) {
					substringList.clear();
					largeSubstring.setLength(0);
				}
			}
			substringList.add(inputStringArray[i]);
			largeSubstring.append(inputStringArray[i]);
		}
		if (largeSubstring.length() > finalLargeSubstring.length()) {
			finalLargeSubstring.setLength(0);
			finalLargeSubstring.append(largeSubstring);
		}
		System.out.println(finalLargeSubstring);
	}
}
