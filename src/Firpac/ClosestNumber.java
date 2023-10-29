// Program to Find the Closest Number to Zero.
package firpac;

public class ClosestNumber {

	public static void main(String[] args) {

		int[] numberArray = { -4, -2, 1, 4, 8 };
		int closestNumber = findClosestNumber(numberArray);
		System.out.println("Closest number to zero : " + closestNumber);

	}

	public static int findClosestNumber(int[] inputArray) {

		int closeNumber = 0;
		int minimumDifference = Integer.MAX_VALUE;

		for (int i = 0; i < inputArray.length; i++) {

			int difference = Math.abs(inputArray[i] - 0);
			if (difference < minimumDifference || (difference == minimumDifference && inputArray[i] > closeNumber)) {
				minimumDifference = difference;
				closeNumber = inputArray[i];
			}
		}
		return closeNumber;
	}
}
