// Longest contiguous Alphanumeric Substring Finder.
package firpac;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {

	public static void main(String[] args) {
		String inputString = "ABCDdefghi123stuvw3456";
		int[] inputStringCodePoints = inputString.codePoints().toArray();
		StringBuilder largestSubstring = new StringBuilder();
		List<String> subStringList = new ArrayList<>();
		int previousLength = 0;
		int currentLength = 0;

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
		System.out.println("List of Substrings : " + subStringList);
		for (int j = 0; j < subStringList.size(); j++) {
			currentLength = subStringList.get(j).length();
			if (currentLength > previousLength) {
				previousLength = currentLength;
			}
		}
		System.out.println("Length of the longest substring : " + previousLength);
	}
}
