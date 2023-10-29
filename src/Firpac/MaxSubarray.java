// Program to Find Maximum Subarray Sum.
package firpac;

public class MaxSubarray {

	public static void main(String[] args) {

		int[] numbersArray = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int largestSum = findMaxSubarray(numbersArray);
		System.out.println("Maximum Subarray Sum: " + largestSum);
	}

	public static int findMaxSubarray(int[] inputArray) {

		int currentSum = 0;
		int maximumSum = Integer.MIN_VALUE;

		for (int number : inputArray) {
			currentSum = Math.max(number, currentSum + number);
			maximumSum = Math.max(maximumSum, currentSum);
		}
		return maximumSum;
	}
}
