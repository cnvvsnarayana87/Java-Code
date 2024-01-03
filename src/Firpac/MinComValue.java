package firpac;

import java.util.Arrays;

public class MinComValue {

	public static void main(String[] args) {
		int[] firstArray = { 1, 2, 3 };
		int[] secondArray = { 2, 4 };
		int minCommonValue = findMinCommonValue(firstArray, secondArray);
		System.out.println("Minimum common value : " + minCommonValue);
	}

	public static int findMinCommonValue(int[] firstArray, int[] secondArray) {

		for (int number : secondArray) {
			if (Arrays.binarySearch(firstArray, number) >= 0) {
				return number;
			}
		}
		return -1;
	}
}
