//
package firpac;

import java.util.Arrays;

public class LargeSubarraySum {

	public static void main(String[] args) {
		int[] numbersArray = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int largestSum = findMaxSubarray(numbersArray);
		System.out.println("Maximum Subarray Sum : " + largestSum);
	}

	public static int findMaxSubarray(int[] inputArray) {
		
		
		int maxValue = Arrays.stream(inputArray).max()
				
		return maxValue;
	
	}

}
