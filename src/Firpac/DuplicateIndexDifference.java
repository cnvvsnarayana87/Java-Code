// Program to check if the array contains duplicates and satisfies the given condition.
ackage firpac;

import java.util.HashMap;
import java.util.Map;

public class DuplicateIndexDifference {

	public static void main(String[] args) {
		int[] numbersArray = { 8,7,15,1,6,1,9,15 };
		int indexDifference = 1;
		int valueDifference = 3;
		boolean result = containsNearbyDuplicate(numbersArray, indexDifference, valueDifference);
		System.out.println("Indices & Values differences of duplicates are within limits: "+result);
	}

	public static boolean containsNearbyDuplicate(int[] numbersArray, int indexDifference, int valueDifference) {
		 Map<Integer, Integer> numberIndex = new HashMap<>();
	        for (int i = 0; i < numbersArray.length; i++) {
	            if (numberIndex.containsKey(numbersArray[i]) &&
	                (Math.abs(numberIndex.get(numbersArray[i]) - i) <= indexDifference) &&
	                (Math.abs(numbersArray[numberIndex.get(numbersArray[i])] - numbersArray[i]) <= valueDifference)) {
	                return true;
	            }
	            numberIndex.put(numbersArray[i], i);
	        }
	        return false;
	}
}
