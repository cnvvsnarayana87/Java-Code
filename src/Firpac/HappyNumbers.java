package firpac;

import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

	public static void main(String[] args) {
		int number = 167;
		int happyNumber = findHappyNumber(number);
		System.out.println("Given number is a Happy Number : " + (happyNumber == 1 ? true : false));
	}

	public static int findHappyNumber(int number) {

		int expectedResult = 0;
		String numberString = String.valueOf(number);
		Set<Integer> uniqueNumbers = new HashSet<>();

		while (expectedResult != 1) {
			expectedResult = numberString.chars().mapToObj(Character::getNumericValue).mapToInt(i -> i * i).sum();
			if (!uniqueNumbers.add(expectedResult)) {
				return 0;
			}
			numberString = String.valueOf(expectedResult);
		}
		return expectedResult;
	}
}
