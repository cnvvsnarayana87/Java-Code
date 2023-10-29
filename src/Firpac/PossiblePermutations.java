package firpac;

import java.util.Arrays;

public class PossiblePermutations {

	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4};
		int[] tempArray = new int[inputArray.length];
		possiblePermutations(inputArray, tempArray, 0);
	}

	public static void possiblePermutations(int[] inputArray, int[] tempArray, int currentIndex) {
		if (currentIndex == inputArray.length) {
			System.out.println(Arrays.toString(tempArray));
			return;
		}

		for (int i = 0; i < inputArray.length; i++) {
			if (isUnused(inputArray[i], tempArray, currentIndex)) {
				tempArray[currentIndex] = inputArray[i];
				possiblePermutations(inputArray, tempArray, currentIndex + 1);
			}
		}
	}

	public static boolean isUnused(int value, int[] tempArray, int currentIndex) {
		for (int i = 0; i < currentIndex; i++) {
			if (tempArray[i] == value) {
				return false;
			}
		}
		return true;
	}
}