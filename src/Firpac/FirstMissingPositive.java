// Program to Find the First Missing Positive Integer.
package Firpac;

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

		for (int i = 0; i < uniqueNumbers.size(); i++) {
			if (uniqueNumbers.contains(minPositiveElement)) {
				minPositiveElement++;
			} else {
				break;
			}
		}
		System.out.println("First positive missng integer : " + minPositiveElement);
	}
}
