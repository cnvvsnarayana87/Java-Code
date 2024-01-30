package firpac;

import java.util.Arrays;

public class SmallerNumbers {

	public static void main(String[] args) {
		int[] numberArray = { 8, 1, 2, 2, 3 };
		int[] numbersSmaller = findnumbersSmaller(numberArray);
		System.out.println("Numbers smaller than the current number : " + Arrays.toString(numbersSmaller));
	}

	public static int[] findnumbersSmaller(int[] numberArray) {
		int[] smallerNumbers = new int[numberArray.length];
		for (int i = 0; i < numberArray.length; i++) {
			int count = 0;
			for (int j = 0; j < numberArray.length; j++) {
				if (i != j && numberArray[i] > numberArray[j]) {
					count++;
				}
				smallerNumbers[i] = count;
			}
		}
		return smallerNumbers;
	}
}
