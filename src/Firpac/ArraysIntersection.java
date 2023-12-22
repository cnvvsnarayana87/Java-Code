package firpac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraysIntersection {

	public static void main(String[] args) {
		int[] inputArray1 = { 1, 2, 2, 1 };
		int[] inputArray2 = { 2, 2 };

		Set<Integer> uniqueElements = Arrays.stream(inputArray1).boxed().collect(Collectors.toSet());
		List<Integer> commonElements = findCommonElements(uniqueElements, inputArray2);

		int[] commonElementsArray = generateArray(commonElements);
		System.out.println("Array of intersection elements :" + Arrays.toString(commonElementsArray));
	}

	public static List<Integer> findCommonElements(Set<Integer> uniqueElements, int[] inputArray2) {
		List<Integer> commonElements = new ArrayList<>();
		for (int i = 0; i < inputArray2.length; i++) {
			if (uniqueElements.contains(inputArray2[i])) {
				commonElements.add(inputArray2[i]);
				uniqueElements.remove(inputArray2[i]);
			}
		}
		return commonElements;
	}

	public static int[] generateArray(List<Integer> commonElements) {
		int[] commonElementsArray = new int[commonElements.size()];
		for (int i = 0; i < commonElements.size(); i++) {
			commonElementsArray[i] = commonElements.get(i);
		}
		return commonElementsArray;
	}
}
