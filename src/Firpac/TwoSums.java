package firpac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSums {

	public static void main(String[] args) {
		int[] numberArray = { 3, 2, 4 };
		int targetSum = 6;
		if (numberArray.length > 1) {
			int[] indicesOfSum = findIndices(numberArray, targetSum);
			System.out.println("Indices of two numbers whose sum equals the target : " + Arrays.toString(indicesOfSum));
		} else {
			System.out.println("Given input doesn't meet the requirements.");
		}
	}

	public static int[] findIndices(int[] numberArray, int targetSum) {
		int[] indicesOfSum = new int[2];
		Set<Integer> uniqueNumbers = new HashSet<>();
		for (int i = 0; i < numberArray.length; i++) {
			int differenceValue = targetSum - numberArray[i];
			if (uniqueNumbers.contains(differenceValue)) {
				indicesOfSum[0] = i;
				indicesOfSum[1] = findIndex(numberArray, differenceValue);
				return indicesOfSum;
			}
			uniqueNumbers.add(numberArray[i]);
		}
		throw new IllegalArgumentException("No two numbers add up to the target");
	}

	public static int findIndex(int[] numberArray, int value) {
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
