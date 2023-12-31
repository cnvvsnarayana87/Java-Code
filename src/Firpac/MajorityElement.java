// Program to Find the Majority Element in an Array.
package firpac;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int[] numbersArray = { 2, 2, 1, 1, 1, 2, 2 };
		int requiredElement = findMajorityElement(numbersArray);
		if (requiredElement != Integer.MIN_VALUE) {
			System.out.println("Majority element in an array : " + requiredElement);
		} else {
			System.out.println("No Majority element identified");
		}
	}

	public static int findMajorityElement(int[] numbersArray) {
		Map<Integer, Integer> numberCount = new HashMap<>();
		for (int number : numbersArray) {
			numberCount.put(number, numberCount.getOrDefault(number, 0) + 1);
		}
		int count = 0;
		int majorityElement = Integer.MIN_VALUE;
		int halfLength = numbersArray.length / 2;
		for (int number : numberCount.keySet()) {
			if (numberCount.get(number) > count) {
				count = numberCount.get(number);
				if (count > halfLength) {
					majorityElement = number;
				}
			}
		}
		return majorityElement;
	}
}
