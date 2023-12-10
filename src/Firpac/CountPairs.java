package firpac;

import java.util.Arrays;

public class CountPairs {

	public static void main(String[] args) {

		int[] numbersArray = { -1, 1, 2, 3, 1 };
		int target = 2;
		int count = checkPair(numbersArray, target);
		System.out.println("Count of Pairs Whose Sum is Less than the Target : " + count);
	}

	public static int checkPair(int[] numbersArray, int target) {

		Arrays.sort(numbersArray);
		int start = 0;
		int end = numbersArray.length - 1;
		int result = 0;
		while (start < end) {
			if (numbersArray[start] + numbersArray[end] < target) {
				result += end - start;
				start++;
			} else {
				end--;
			}
		}
		return result;
	}
}
