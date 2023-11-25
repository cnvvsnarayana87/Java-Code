// Program to find the missing number.
package firpac;

public class IdentifyNumber {

	public static void main(String[] args) {
		int[] numbersArray = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int requiredNumber = findMissingNumber(numbersArray);
		System.out.println("Missing number is " + requiredNumber);
	}

	public static int findMissingNumber(int[] numbersArray) {

		int missingNumber = 0;
		for (int i = 0; i <= numbersArray.length; i++) {
			missingNumber ^= i;
			if (i < numbersArray.length) {
				missingNumber ^= numbersArray[i];
			}
		}
		return missingNumber;
	}
}
