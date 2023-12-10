package firpac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TargetElementIndex {

	public static void main(String[] args) {
		int[] numbersArray = { 1, 2, 5, 2, 3 };
		int target = 2;
		System.out.println(
				"List of indices of the target elements in a sorted array: " + targetIndices(numbersArray, target));
	}

	public static List<Integer> targetIndices(int[] numbersArray, int target) {
		Arrays.sort(numbersArray);
		return IntStream.range(0, numbersArray.length).filter(i -> numbersArray[i] == target).boxed()
				.collect(Collectors.toList());
	}
}
