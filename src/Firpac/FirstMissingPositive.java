// Program to Find the First Missing Positive Integer.
package firpac;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstMissingPositive {

	public static void main(String[] args) {

		int[] inputArray = { -4, 2, 3, 5, -1, -3, 7, 1 };

		int minPositiveElement = Arrays.stream(inputArray).min().getAsInt();
		if (minPositiveElement <= 0) {
			minPositiveElement = 1;
		}

		Set<Integer> uniqueNumbers = Arrays.stream(inputArray).boxed().collect(Collectors.toSet());

		int missingNumber = findFirstPositive(uniqueNumbers, minPositiveElement);
		System.out.println("First missing positive integer : " + missingNumber);
	}

	public static int findFirstPositive(Set<Integer> uniqueNumbers, int minPositiveElement) {
		int result = minPositiveElement;
		while (uniqueNumbers.contains(result)) {
			result++;
		}
		return result;
	}
}
