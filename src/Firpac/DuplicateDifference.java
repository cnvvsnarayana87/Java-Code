// Program to check if the array contains duplicates and satisfies the given condition.
package firpac;

import java.util.HashMap;
import java.util.Map;

public class DuplicateDifference {

	public static void main(String[] args) {
		int[] numbersArray = { 1, 2, 3, 1 };
		int k = 3;
		boolean result = containsNearbyDuplicate(numbersArray, k);
		System.out.println("Contains duplicates with an index difference less than " + k + " is " + result);
	}

	public static boolean containsNearbyDuplicate(int[] numbersArray, int k) {
		Map<Integer, Integer> numberIndex = new HashMap<>();
		for (int i = 0; i < numbersArray.length; i++) {
			if (numberIndex.containsKey(numbersArray[i]) && i - numberIndex.get(numbersArray[i]) <= k) {
				return true;
			}
			numberIndex.put(numbersArray[i], i);
		}
		return false;
	}
}
