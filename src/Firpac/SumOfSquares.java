// Program to calculate the sum of the squares of distinct counts for all subarrays of an array.
package firpac;

public class SumOfSquares {

	public static void main(String[] args) {

		int[] numbersArray = { 2, 2, 5, 5 };
		int sum = calculateSumOfSquares(numbersArray);
		System.out.println("Sum of squares of distinct elements: " + sum);
	}

	public static int calculateSumOfSquares(int[] numbersArray) {

		int length = numbersArray.length;
		int sum = 0;
		for (int i = 0; i < length; i++) {
			int distinctElements = 0;
			int[] occurrences = new int[101];
			for (int j = i; j < length; j++) {
				if (occurrences[numbersArray[j]] == 0) {
					distinctElements++;
				}
				occurrences[numbersArray[j]]++;
				int elementsSquare = distinctElements * distinctElements;
				sum += elementsSquare;
			}
		}
		return sum;
	}
}
