// Program to Find the Single Distinct Number.
package firpac;

import java.util.HashSet;
import java.util.Set;

public class DistinctNumber {

	public static void main(String[] args) {
		int[] numbersArray = { 2, 2, 1 };
		int singleNumber = findSingleNumber(numbersArray);
		System.out.println("Single Distinct Number in the Array: " + singleNumber);
	}

	public static int findSingleNumber(int[] numbersArray) {
		Set<Integer> uniqueNumbers = new HashSet<>();
		int result = 0;
		for (int number : numbersArray) {
			result ^= number;
			if (!uniqueNumbers.add(number)) {
				uniqueNumbers.remove(number);
			}
		}

		if (uniqueNumbers.contains(result)) {
			return result;
		} else {
			result = 0;
		}
		if (result == 0) {
			throw new IllegalArgumentException(
					"The input does not meet the requirement that every element appears twice except for one.");
		}
		return result;
	}
}
