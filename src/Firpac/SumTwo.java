package firpac;

import java.util.Arrays;

public class SumTwo {

	public static void main(String[] args) {
		int[] numberArray = { 2, 7, 11, 15 };
		int targetSum = 9;
		if (numberArray.length > 1) {
			int[] indicesOfSum = findIndices(numberArray, targetSum);
			System.out.println("Indices of two numbers whose sum equals the target : " + Arrays.toString(indicesOfSum));
		} else {
			System.out.println("Given input doesn't meet the requirements.");
		}
	}

	public static int[] findIndices(int[] numberArray, int targetSum) {
		int[] indicesOfSum = new int[2];
		for (int i = 0; i < numberArray.length; i++) {
			for (int j = 0; j < numberArray.length; j++) {
				if (i != j && numberArray[i] + numberArray[j] == targetSum) {
					indicesOfSum[0] = i;
					indicesOfSum[1] = j;
					return indicesOfSum;
				}
			}
		}
		throw new IllegalArgumentException("No two numbers add up to the target");
	}
}
