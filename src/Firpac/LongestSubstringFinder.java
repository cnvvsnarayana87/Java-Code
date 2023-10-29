// Program to Find the Longest Contiguous Alphanumeric Substring.
package firpac;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringFinder {

	public static void main(String[] args) {
		String inputString = "ABCDdefghi123stuvw3456";
		int[] inputStringCodePoints = inputString.codePoints().toArray();
		StringBuilder largestSubstring = new StringBuilder();
		List<String> subStringList = new ArrayList<>();
		
		for (int i = 0; i < inputStringCodePoints.length; i++) {
			if (Character.isLetterOrDigit(inputStringCodePoints[i])) {
				largestSubstring.appendCodePoint(inputStringCodePoints[i]);
				if (i + 1 < inputStringCodePoints.length
						&& inputStringCodePoints[i] + 1 != inputStringCodePoints[i + 1]) {
					String subString = largestSubstring.toString();
					subStringList.add(subString);
					largestSubstring.setLength(0);
				}
			}
		}
		if (largestSubstring.length() > 0) {
			String largeString = largestSubstring.toString();
			subStringList.add(largeString);
		}
		identifyLongestSubstring(subStringList);
	}

	public static void identifyLongestSubstring(List<String> subStringList) {
		int longestLength = 0;
		String longestsubString = "";
		for (String subString : subStringList) {
			int length = subString.length();
			if (length > longestLength) {
				longestLength = length;
				longestsubString = subString;
			}
		}
		System.out.println("Longest Substring : " + longestsubString);
		System.out.println("Length of the longest substring : " + longestLength);
	}
}
