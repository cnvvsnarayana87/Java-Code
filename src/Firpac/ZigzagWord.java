// Program for Generating Zigzag Words.
package firpac;

import java.util.Arrays;

public class ZigzagWord {

	public static void main(String[] args) {
		String inputString = "Dream big and work hard";
		if (inputString.isEmpty() || inputString.length() == 1) {
			System.out.println("The provided input does not meet the requirements.");
		} else {
			System.out.println("Zigzag word is : " + generateZigzagWord(inputString));
		}
	}

	public static String generateZigzagWord(String inputString) {
		String[] words = inputString.split(" ");
		int maxLength = Arrays.stream(words).map(String::length).max(Integer::compare).orElse(0);
		StringBuilder expectedResult = new StringBuilder();
		for (int i = 0; i < maxLength; i++) {
			int wordIndex = 0;
			while (wordIndex < words.length) {
				if (i < words[wordIndex].length()) {
					expectedResult.append(words[wordIndex].charAt(i));
				}
				wordIndex++;
			}
		}
		return expectedResult.toString();
	}
}
