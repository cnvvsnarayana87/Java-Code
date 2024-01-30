package firpac;

import java.util.Arrays;

public class NumbersSmaller {

	public static void main(String[] args) {
		int[] numberArray = { 8, 1, 2, 2, 3 };
		int[] numbersSmaller = findnumbersSmaller(numberArray);
		System.out.println("Numbers smaller than the current number : " + Arrays.toString(numbersSmaller));
	}

	public static int[] findnumbersSmaller(int[] numberArray) {
		int maxNumber = findMaximumNumber(numberArray);
		int[] numberCount = findNumberCount(numberArray, maxNumber);
		int[] numbersSmaller = new int[numberArray.length];
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] == 0) {
				numbersSmaller[i] = 0;
			} else {
				numbersSmaller[i] = numberCount[numberArray[i] - 1];
			}
		}
		return numbersSmaller;
	}

	public static int findMaximumNumber(int[] numberArray) {
		int maxNumber = 0;
		for (int i = 0; i < numberArray.length; i++) {
			int number = numberArray[i];
			if (number > maxNumber) {
				maxNumber = number;
			}
		}
		return maxNumber;
	}

	public static int[] findNumberCount(int[] numberArray, int maxNumber) {
		int[] numberCount = new int[maxNumber + 1];
		for (int i = 0; i < numberArray.length; i++) {
			numberCount[numberArray[i]]++;
		}

		for (int i = 1; i < numberCount.length; i++) {
			numberCount[i] += numberCount[i - 1];
		}
		return numberCount;
	}
}
