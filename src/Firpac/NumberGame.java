package firpac;

import java.util.Arrays;

public class NumberGame {

	public static void main(String[] args) {
		int[] numberArray = { 5, 4, 2, 3 };
		if (numberArray.length % 2 == 0) {
			int[] rearrangedArray = numberGame(numberArray);
			System.out.println("Array after arranging elements based on the provided inputs : "
					+ Arrays.toString(rearrangedArray));
		} else {
			System.out.println("Given input doesn't meet the requirement");
		}
	}

	public static int[] numberGame(int[] numberArray) {

		Arrays.sort(numberArray);
		int length = numberArray.length;
		int[] rearrangedArray = new int[length];

		for (int i = 0; i < length; i += 2) {
			rearrangedArray[i] = numberArray[i + 1];
			rearrangedArray[i + 1] = numberArray[i];
		}
		return rearrangedArray;
	}
}
