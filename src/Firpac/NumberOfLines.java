package firpac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfLines {

	public static void main(String[] args) {
		int[] widths = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10 };
		String inputString = "bbbcccdddaaa";
		int[] numberOfLines = findNumberOfLines(inputString, widths);
		System.out.println(
				"Number of lines and width of the last line to write a string : " + Arrays.toString(numberOfLines));
	}

	public static int[] findNumberOfLines(String inputString, int[] widths) {

		Map<Character, Integer> characterMap = new HashMap<>();
		for (int i = 0; i < 26; i++) {
			characterMap.put((char) ('a' + i), i);
		}

		int[] numberOfLines = new int[2];
		int k = 0;
		for (int i = 0; i < inputString.length(); i++) {
			int j = widths[characterMap.get(inputString.charAt(i))];
			k += j;
			if (k > 100) {
				numberOfLines[0]++;
				k = 0;
				i = i - 1;
			}
		}
		if (k > 0) {
			numberOfLines[0]++;
			numberOfLines[1] = k;
		}
		return numberOfLines;
	}
}
