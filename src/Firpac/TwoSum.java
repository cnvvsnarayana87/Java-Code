/* Given an array of integers, find the indices of two numbers that add up to a specific target. 
 * Assume each input has exactly one solution, and the same element cannot be used twice.*/
package Firpac;

import java.util.ArrayList;

public class TwoSum {

	public static void main(String[] args) {

		int[] numberArray = { 7, 11, 6, 55, 98, 45, 16, 96, 46 };
		int targetSum = 22;

		ArrayList<Integer> uniqueNumbers = new ArrayList<>();
		ArrayList<Integer> indicesOfSum = new ArrayList<>();
		for (int i = 0; i < numberArray.length; i++) {
			if (!uniqueNumbers.contains(numberArray[i])) {
				uniqueNumbers.add(numberArray[i]);
			}
		}
		for (int j = 0; j < uniqueNumbers.size(); j++) {
			int secondNumber = targetSum - uniqueNumbers.get(j);
			if (uniqueNumbers.contains(secondNumber) && secondNumber != uniqueNumbers.get(j)) {
				indicesOfSum.add(j);
				indicesOfSum.add(uniqueNumbers.indexOf(secondNumber));
				break;
			}
		}
		if (indicesOfSum.size() == 2) {
			System.out.println("Indices of the two numbers : " + indicesOfSum.get(0) + " , " + indicesOfSum.get(1));
		} else {
			System.out.println("No two numbers add up to the target");
		}
	}
}
