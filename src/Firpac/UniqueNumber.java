// Program to Find the Single Distinct Number.
package firpac;

public class UniqueNumber {

	public static void main(String[] args) {

		int[] numbersArray = { 4, 1, 2, 1, 2 };
		int singleNumber = findSingleNumber(numbersArray);
		System.out.println("Single Distinct Number in the Array: " + singleNumber);
	}

	public static int findSingleNumber(int[] numbersArray) {
		int result = 0;
		for (int number : numbersArray) {
			result ^= number;
		}
		int uniqueNumber = 0;
		for (int number : numbersArray) {
			if ((result ^ number) == 0) {
				if (uniqueNumber == 0) {
					uniqueNumber = number;
				} else {
					uniqueNumber = 0;
				}
			}
		}
		if (uniqueNumber == 0) {
			throw new IllegalArgumentException(
					"The input does not meet the requirement that every element appears twice except for one.");
		}
		return uniqueNumber;
	}
}
