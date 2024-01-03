package firpac;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		int number = 167;
		int happyNumber = findHappyNumber(number);
		System.out.println("Given number is a Happy Number : " + (happyNumber == 1 ? true : false));
	}

	public static Set<Integer> uniqueNumbers = new HashSet<>();

	public static int findHappyNumber(int result) {

		char[] numberArray = String.valueOf(result).toCharArray();
		int expectedResult = 0;
		for (int i = 0; i < numberArray.length; i++) {
			int digit = Character.getNumericValue(numberArray[i]);
			int temp = digit * digit;
			expectedResult = expectedResult + temp;
		}
		if (!uniqueNumbers.add(expectedResult)) {
			return 0;
		}
		if (expectedResult != 1) {
			return findHappyNumber(expectedResult);
		} else {
			return 1;
		}
	}
}
