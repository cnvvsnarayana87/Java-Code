package firpac;

import java.util.HashSet;
import java.util.Set;

public class HappyNum {

	public static void main(String[] args) {
		int number = 167;
		boolean happyNumber = isHappyNumber(number);
		System.out.println("Given number is a Happy Number : " + happyNumber);
	}

	public static boolean isHappyNumber(int number) {

		int expectedResult = number;
		Set<Integer> uniqueNumbers = new HashSet<>();

		while (expectedResult != 1) {
			String numberString = String.valueOf(expectedResult);
			expectedResult = numberString.chars().map(Character::getNumericValue).map(i -> i * i).sum();
			if (!uniqueNumbers.add(expectedResult)) {
				return false;
			}
		}
		return true;
	}
}
