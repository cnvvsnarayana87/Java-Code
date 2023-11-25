// Program to find the single digit obtained by adding all the digits of a number repeatedly.
package firpac;

public class AddDigit {

	public static void main(String[] args) {

		int number = 199;
		int expectedResult = 0;
		while (number > 0 || expectedResult > 9) {
			if (number == 0) {
				number = expectedResult;
				expectedResult = 0;
			}
			expectedResult += number % 10;
			number = number / 10;
		}
		System.out.println("Single digit by adding all the digits of a number repeatedly : " + expectedResult);
	}
}
