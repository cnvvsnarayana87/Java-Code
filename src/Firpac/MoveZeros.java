// Program to move all zeros to the end of an array.
package firpac;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int[] numbersArray = { 0, 1, 0, 3, 12 };
		int j = 0;
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] != 0) {
				numbersArray[j] = numbersArray[i];
				j++;
			}
		}

		for (int i = j; i < numbersArray.length; i++) {
			numbersArray[i] = 0;
		}
		System.out.println("Array after moving zeros to the end : " + Arrays.toString(numbersArray));
	}
}
