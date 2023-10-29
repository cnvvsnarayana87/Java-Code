// Program to Find the Longest Palindromic Substring
package firpac;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		String inputString = "xyxtcbabclmn";
		String longestPalindrome = findLongestPalindrome(inputString);
		System.out.println("Longest Palindromic Substring : " + longestPalindrome);
	}

	public static String findLongestPalindrome(String inputString) {
		int[] stringCodePoint = inputString.codePoints().toArray();
		StringBuilder palindromicSubstring = new StringBuilder();

		int start = 0;
		int end = 0;
		for (int i = 1; i < stringCodePoint.length; i++) {
			int j = 0;
			while (i - j >= 0 && i + j < stringCodePoint.length && stringCodePoint[i - j] == stringCodePoint[i + j]) {
				if (2 * j + 1 > end - start) {
					start = i - j;
					end = i + j;
				}
				j++;
			}

			j = 0;
			while (i - j - 1 >= 0 && i + j < stringCodePoint.length
					&& stringCodePoint[i - j - 1] == stringCodePoint[i + j]) {
				if (2 * j + 2 > end - start) {
					start = i - j - 1;
					end = i + j;
				}
				j++;
			}
		}

		for (int k = start; k <= end; k++) {
			palindromicSubstring.appendCodePoint(stringCodePoint[k]);
		}
		return palindromicSubstring.toString();
	}
}
