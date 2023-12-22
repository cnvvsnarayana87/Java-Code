package firpac;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] inputArray1 = { 1, 2, 2, 1 };
		int[] inputArray2 = { 2, 2 };

		Set<Integer> uniqueElements = Arrays.stream(inputArray1).boxed().collect(Collectors.toSet());
		int[] commonElements = Arrays.stream(inputArray2).distinct().filter(uniqueElements::contains).toArray();

		System.out.println("Array of intersection elements :" + Arrays.toString(commonElements));
	}
}
