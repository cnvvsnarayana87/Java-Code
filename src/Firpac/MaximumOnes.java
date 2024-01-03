package firpac;

import java.util.Arrays;

public class MaximumOnes {

	public static void main(String[] args) {
		int[][] inputArray = { { 0, 1 }, { 1, 0 } };
		int[] indexAndMaxOnes = findIndexAndMaxOnes(inputArray);
		System.out.println("Index and the maximum count of ones : " + Arrays.toString(indexAndMaxOnes));
	}

	public static int[] findIndexAndMaxOnes(int[][] inputArray) {

		int maxCount = 0;
		int index = 0;
		for (int j = 0; j < inputArray.length; j++) {
			int count = 0;
			int[] row = inputArray[j];
			for (int i = 0; i < row.length; i++) {
				if (row[i] == 1) {
					count++;
				}
				if (count > maxCount) {
					maxCount = count;
					index = j;
				}
			}
		}
		return new int[] { index, maxCount };
	}
}
