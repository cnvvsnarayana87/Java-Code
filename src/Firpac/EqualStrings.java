package firpac;

import java.util.Arrays;

public class EqualStrings {

	public static void main(String[] args) {
		String string1 = "abc";
		String string2 = "abb";
		String string3 = "ab";
		int numberOfOperations = findMinimumOperations(string1, string2, string3);
		System.out.println("Minimum number of operations needed to make the three strings equal : "+numberOfOperations);
	}

	public static int findMinimumOperations(String string1, String string2, String string3) {
		if (string1.equals(string2) && string2.equals(string3)) {
			return 0;
		}
		int minLength = Arrays.stream(new int[] { string1.length(), string2.length(), string3.length() }).min()
				.getAsInt();
		for (int i = minLength; i >= 1; i--) {
			if (string1.substring(0, i).equals(string2.substring(0, i))
					&& string2.substring(0, i).equals(string3.substring(0, i))) {
				return (string1.length() - i) + (string2.length() - i) + (string3.length() - i);
			}
		}
		return -1;
	}
}
