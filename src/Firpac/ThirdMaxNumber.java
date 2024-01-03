package firpac;

import java.util.Arrays;

public class ThirdMaxNumber {

	public static void main(String[] args) {
		int[] numberArray = { 2, 1, 2 };
		int thirdMaxNumber = findThirdMaxNumber(numberArray);
		System.out.println("Third Maximum Number : " + thirdMaxNumber);
	}

	public static int findThirdMaxNumber(int[] numberArray) {
		int result = 0;
		int[] uniqueArray = Arrays.stream(numberArray).distinct().sorted().boxed().sorted((a, b) -> b.compareTo(a))
				.mapToInt(Integer::intValue).toArray();
		if (uniqueArray.length >= 3) {
			result = uniqueArray[2];
		} else {
			result = Arrays.stream(numberArray).max().getAsInt();
		}
		return result;
	}
}
