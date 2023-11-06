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
		return result;
	}
}
