package firpac;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateIndexDifference {

	public static void main(String[] args) {
		int[] numbersArray = { 1, 2, 3, 1 };
		int k = 3;
		boolean result = containsNearbyDuplicate(numbersArray, k);
		System.out.println("Contains duplicate with an index difference less than " + k + " is " + result);
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		return  Arrays.stream(nums)
				.boxed()
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, toList()))
				.values().stream()
				.anyMatch(list -> list.size() > 1 &&
						IntStream.range(1, list.size())
						.anyMatch(i -> list.get(i) - list.get(i - 1) <= k));
	}
}
		
