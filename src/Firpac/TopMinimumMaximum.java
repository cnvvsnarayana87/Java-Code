// Program to Find Minimum and Maximum Values.

package Firpac;

import java.util.Arrays;
import java.util.Scanner;

public class TopMinimumMaximum {

	public static void main(String[] args) {

		int[] originalArray = { 7, 11, 6, 55, 98, 45, 16, 96, 46 };
		Arrays.sort(originalArray);
		int arrayLength = originalArray.length;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Minimum and Maximum Values to be identified : ");
		int expectedValues = scanner.nextInt();

		int[] topMinValues = Arrays.copyOfRange(originalArray, 0, expectedValues);
		System.out.println("Top " + expectedValues + " Minimum Values : " + Arrays.toString(topMinValues));

		int[] topMaxValues = Arrays.copyOfRange(originalArray, arrayLength - expectedValues, arrayLength);
		System.out.println("Top " + expectedValues + " Maximum Values : " + Arrays.toString(topMaxValues));

		scanner.close();
	}
}
