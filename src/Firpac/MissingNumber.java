// Program to find the missing number.
package firpac;

public class MissingNumber {

	public static void main(String[] args) {
		int[] numbersArray = { 3,0,1 };
		int requiredNumber = findMissingNumber(numbersArray);
		System.out.println("Missing number is " + requiredNumber);
	}

	public static int findMissingNumber(int[] numbersArray) {

		int minimumNumber = Integer.MAX_VALUE;
		int maximumNumber = Integer.MIN_VALUE;
		int actualSum = 0;
		int expectedSum = 0;

		for (int i = 0; i <= numbersArray.length; i++) {
			if (i < numbersArray.length) {
				minimumNumber = Math.min(minimumNumber, numbersArray[i]);
				maximumNumber = Math.max(maximumNumber, numbersArray[i]);
				actualSum += numbersArray[i];
			}
			expectedSum += i;
		}
		int missingNumber = expectedSum - actualSum;
		if (missingNumber == 0 && minimumNumber == 0) {
			return maximumNumber + 1;
		} else if (missingNumber == 0 && minimumNumber == 1) {
			return minimumNumber - 1;
		}
		return missingNumber;
	}
}
