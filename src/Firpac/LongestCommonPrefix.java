// Program to find the longest common prefix.
package Firpac;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] words = { "flower", "flow", "flight" };
		StringBuilder commonPrefix = new StringBuilder();
		int shortestWordLength = findMinLength(words);

		outerLoop: for (int i = 0; i < shortestWordLength; i++) {
			char currentChar = words[0].charAt(i);
			boolean isCommon = true;

			for (int j = 1; j < words.length; j++) {
				if (currentChar != words[j].charAt(i)) {
					isCommon = false;
					break outerLoop;
				}
			}
			if (isCommon) {
				commonPrefix.append(currentChar);
			}
		}
		System.out.println("Common Prefix: " + commonPrefix);
	}

	public static int findMinLength(String[] words) {
		int minLength = Integer.MAX_VALUE;
		for (String word : words) {
			int length = word.length();
			if (minLength > length) {
				minLength = length;
			}
		}
		return minLength;
	}
}
