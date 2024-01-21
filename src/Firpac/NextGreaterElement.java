package firpac;

import java.util.Arrays;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] firstArray = { 4, 1, 2 };
		int[] secondArray = { 1, 3, 4, 2 };
		int[] greaterElements = findNextGreaterElements(firstArray, secondArray);
		System.out.println("Next greater elements : " + Arrays.toString(greaterElements));
	}

	public static int[] findNextGreaterElements(int[] firstArray, int[] secondArray) {
		int[] greaterElements = new int[firstArray.length];
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				if (firstArray[i] == secondArray[j]) {
					greaterElements[i] = findNextGreaterNumber(j, secondArray);
				}
			}
		}
		return greaterElements;
	}

	public static int findNextGreaterNumber(int j, int[] secondArray) {
		for (int i = j + 1; i < secondArray.length; i++) {
			if (secondArray[i] > secondArray[j]) {
				return secondArray[i];
			}
		}
		return -1;
	}
}
