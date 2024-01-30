package firpac;

import java.util.Arrays;

public class StringMatch {

	public static void main(String[] args) {
		String inputString = "IDID";
		int[] stringMatch = findStringMatch(inputString);
		System.out.println("An integer array that can be represented as a string : " + Arrays.toString(stringMatch));
	}

	public static int[] findStringMatch(String inputString) {

		char[] originalArray = inputString.toCharArray();
		int length = originalArray.length;
		int[] permutation = new int[length + 1];
		int start = 0;
		int end = 0;
		for (int i = 0; i <= length; i++) {
			if (i < length && originalArray[i] == 'I') {
				permutation[i] = start;
				start++;
			} else {
				permutation[i] = length - end;
				end++;
			}
		}
		return permutation;
	}
}
