// Program to Find the Single Distinct Number.
package firpac;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		int[] numbersArray = { 2, 2, 1 };
		int uniqueNumber = findSingleNumber(numbersArray);
		System.out.println("Single Distinct Number in the Array: " + uniqueNumber);
	}

	public static int findSingleNumber(int[] numbersArray) {
		Map<Integer, Integer> integerCount = new HashMap<>();
		int result = 0;
		for (int i = 0; i < numbersArray.length; i++) {
			integerCount.put(numbersArray[i], integerCount.getOrDefault(numbersArray[i], 0) + 1);
		}
		for (int i = 0; i < numbersArray.length; i++) {
			if (integerCount.get(numbersArray[i]) == 1) {
				result = numbersArray[i];
			}
		}
		return result;
	}
}
