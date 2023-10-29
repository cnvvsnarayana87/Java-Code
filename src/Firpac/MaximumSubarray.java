// Program to Find Maximum Subarray Sum. 
package firpac;

public class MaximumSubarray {

	public static void main(String[] args) {

		int[] numbersArray = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int largestSum = findMaxSubarray(numbersArray);
		System.out.println("Maximum Subarray Sum : " + largestSum);
	}

	public static int findMaxSubarray(int[] inputArray) {

		int currentSum = 0;
		int maximumSum = Integer.MIN_VALUE;
		for (int i = 0; i < inputArray.length; i++) {
			currentSum = currentSum + inputArray[i];
			currentSum = Math.max(currentSum, inputArray[i]);
			if (currentSum > maximumSum) {
				maximumSum = currentSum;
			}
		}
		return maximumSum;
	}
}
