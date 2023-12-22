package firpac;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElement {

	public static void main(String[] args) {
		int[] array1 = { 4, 3, 2, 3, 1 };
		int[] array2 = { 2, 2, 5, 2, 3, 6 };
		int[] occurrence = new int[2];
		occurrence[0] = findCommonElementsIndex(array2, array1);
		occurrence[1] = findCommonElementsIndex(array1, array2);
		System.out.println("Number of indices where elements from one array occur in another array : "
				+ Arrays.toString(occurrence));
	}

	public static int findCommonElementsIndex(int[] firstArray, int[] secondArray) {
		Set<Integer> uniqueElements = Arrays.stream(firstArray).boxed().collect(Collectors.toSet());
		System.out.println(uniqueElements);
		int count = (int) Arrays.stream(secondArray).filter(uniqueElements::contains).count();
		return count;
	}
}
