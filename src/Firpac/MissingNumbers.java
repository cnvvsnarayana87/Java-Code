// Program to find the Missing Numbers.
package firpac;

import java.util.HashSet;
import java.util.Set;

public class MissingNumbers {

	public static void main(String[] args) {

		int[] numbersArray = { 0, 5, 8, 4, 1, 7, 2 };
		Set<Integer> requiredNumbers = findMissingNumbers(numbersArray);
		if (requiredNumbers.isEmpty()) {
			System.out.println("Provided input does not meet the requirement.");
		} else {
			System.out.println("Missing numbers: " + requiredNumbers);
		}
	}

	public static Set<Integer> findMissingNumbers(int[] numbersArray) {
		int minimumNumber = Integer.MAX_VALUE;
		int maximumNumber = Integer.MIN_VALUE;
		Set<Integer> missingNumbers = new HashSet<>();
		for (int i = 0; i < numbersArray.length; i++) {
			minimumNumber = Math.min(minimumNumber, numbersArray[i]);
			maximumNumber = Math.max(maximumNumber, numbersArray[i]);
			missingNumbers.add(numbersArray[i]);
		}
		for (int i = minimumNumber; i <= maximumNumber; i++) {
			if (!missingNumbers.add(i)) {
				missingNumbers.remove(i);
			}
		}
		return missingNumbers;
	}
}
