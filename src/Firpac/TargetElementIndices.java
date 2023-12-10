package firpac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetElementIndices {

	public static void main(String[] args) {
		int[] numbersArray = { 1, 2, 5, 2, 3 };
		int target = 2;
		System.out.println(
				"List of indices of the target elements in a sorted array: " + targetIndices(numbersArray, target));
	}

	public static List<Integer> targetIndices(int[] numbersArray, int target) {
		List<Integer> indicesList = new ArrayList<>();
		Arrays.sort(numbersArray);
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] == target) {
				indicesList.add(i);
			}
		}
		return indicesList;
	}
}
