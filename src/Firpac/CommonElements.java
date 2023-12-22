package firpac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		int[] array1 = { 3, 4, 2, 3 };
		int[] array2 = { 1, 5 };
		int[] occurrence = new int[2];
		occurrence[0] = findCommonElementsIndex(array2, array1);
		occurrence[1] = findCommonElementsIndex(array1, array2);
		System.out.println("Number of indices where elements from one array occur in another array : "
				+ Arrays.toString(occurrence));
	}

	public static int findCommonElementsIndex(int[] firstArray, int[] secondArray) {
		Set<Integer> uniqueElements = new HashSet<>();
		for (int number : firstArray) {
			uniqueElements.add(number);
		}
		System.out.println(uniqueElements);
		int count = 0;
		for (int i = 0; i < secondArray.length; i++) {
			if (uniqueElements.contains(secondArray[i])) {
				count++;
			}
		}
		return count;
	}
}
