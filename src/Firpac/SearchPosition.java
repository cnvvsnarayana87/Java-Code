// Program to Search for the Insert Position.
package firpac;

import java.util.Scanner;

public class SearchPosition {

	public static void main(String[] args) {

		int[] sortedArray = { 1, 3, 4, 6, 8 };

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number to search its Index : ");
		int targetNumber = scanner.nextInt();

		int index = findInsertPosition(sortedArray, targetNumber);
		System.out.println("Index of Number is " + index);
		scanner.close();
	}

	public static int findInsertPosition(int[] orderedElements, int target) {
		for (int i = 0; i < orderedElements.length; i++) {
			if (target <= orderedElements[i]) {
				return i;
			}
		}
		return orderedElements.length;
	}
}
