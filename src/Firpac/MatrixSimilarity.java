// Program to check the Matrix Similarity After Cyclic Shifts.
package firpac;

import java.util.Arrays;

public class MatrixSimilarity {

	public static void main(String[] args) {
		int[][] inputMatrix = { { 1, 2, 1, 2 }, { 5, 5, 5, 5 }, { 6, 3, 6, 3 } };
		int shiftBy = 2;
		boolean result = checkSimilar(inputMatrix, shiftBy);
		System.out.println("The initial and final matrices are exactly the same : " + result);
	}

	public static boolean checkSimilar(int[][] inputMatrix, int shiftBy) {
		for (int i = 0; i < inputMatrix.length; i++) {
			int[] subArray = inputMatrix[i];
			boolean isEven = i % 2 == 0;
			int[] result = evenOddShift(subArray, shiftBy, isEven);
			if (!Arrays.equals(subArray, result)) {
				return false;
			}
		}
		return true;
	}

	public static int[] evenOddShift(int[] subArray, int shiftBy, boolean isEven) {

		int rowLength = subArray.length;
		int[] expectedArray = new int[rowLength];
		shiftBy = shiftBy % rowLength;
		for (int i = 0; i < rowLength; i++) {
			int newIndex;
			if (isEven) {
				newIndex = (rowLength + (i - shiftBy)) % rowLength;
			} else {
				newIndex = (i + shiftBy) % rowLength;
			}
			expectedArray[newIndex] = subArray[i];
		}
		return expectedArray;
	}
}
