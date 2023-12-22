package firpac;

import java.util.Arrays;

public class EqualString {

	public static void main(String[] args) {
		String string1 = "abc";
		String string2 = "abb";
		String string3 = "ab";
		int numberOfOperations = findMinimumOperations(string1, string2, string3);
		System.out
				.println("Minimum number of operations needed to make the three strings equal : " + numberOfOperations);
	}

	public static int findMinimumOperations(String string1, String string2, String string3) {

		int minLength = Arrays.stream(new int[] { string1.length(), string2.length(), string3.length() }).min()
				.getAsInt();
		int count = 0;
		for (int i = 0; i < minLength; i++) {
			if (string1.charAt(i) == string2.charAt(i) && string2.charAt(i) == string3.charAt(i)) {
				count++;
			} else {
				break;
			}
		}
		if (count == 0) {
			return -1;
		}
		return (string1.length() - count) + (string2.length() - count) + (string3.length() - count);
	}
}
