package firpac;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MinCommonValue {

	public static void main(String[] args) {
		int[] firstArray = { 1, 2, 3 };
		int[] secondArray = { 2, 4 };
		int minCommonValue = findMinCommonValue(firstArray, secondArray);
		System.out.println("Minimum common value : " + minCommonValue);
	}

	public static int findMinCommonValue(int[] firstArray, int[] secondArray) {

		Set<Integer> uniqueNumbers = Arrays.stream(firstArray).distinct().boxed().collect(Collectors.toSet());
		for (int number : secondArray) {
			if (uniqueNumbers.contains(number)) {
				return number;
			}
		}
		return -1;
	}
}
