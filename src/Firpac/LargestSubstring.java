// Program to Find the Largest Substring without repeated characters.
package firpac;

import java.util.ArrayList;
import java.util.List;

public class LargestSubstring {

	public static void main(String[] args) {

		String inputString = "xyzabbcdeffghbecdlk";
		char[] inputStringArray = inputString.toCharArray();
		StringBuilder largeSubstring = new StringBuilder();
		StringBuilder finalLargeSubstring = new StringBuilder();
		List<Character> largestSubstring = new ArrayList<>();
		List<String> largestSubstringsList = new ArrayList<>();
		for (int i = 0; i < inputStringArray.length; i++) {

			if (largestSubstring.contains(inputStringArray[i])) {
				if (largeSubstring.length() > finalLargeSubstring.length()) {
					finalLargeSubstring.setLength(0);
					finalLargeSubstring.append(largeSubstring);
					largestSubstring.clear();
					largeSubstring.setLength(0);
				} else if (largeSubstring.length() < finalLargeSubstring.length()) {
					largestSubstring.clear();
					largeSubstring.setLength(0);
				} else if (largeSubstring.length() == finalLargeSubstring.length()) {
					largestSubstringsList.add(finalLargeSubstring.toString());
					largestSubstringsList.add(largeSubstring.toString());
					largestSubstring.clear();
					largeSubstring.setLength(0);
					System.out.println(largestSubstringsList);
				}
			}
			largestSubstring.add(inputStringArray[i]);
			largeSubstring.append(inputStringArray[i]);
		}
		if (largeSubstring.length() > finalLargeSubstring.length()) {
			finalLargeSubstring.setLength(0);
			finalLargeSubstring.append(largeSubstring);
		}
		System.out.println(finalLargeSubstring);
	}
}
