// Program to Find Minimum Index Sum of Two Lists.
package firpac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeastIndexSum {

	public static void main(String[] args) {

		String[] list1 = { "Shogun", "KFC", "Tapioca Express", "Burger King" };
		String[] list2 = { "KFC", "Shogun", "Burger King" };

		Map<String, Integer> elementsIndexSum = new HashMap<>();

		Set<String> commonElements = new HashSet<>(Arrays.asList(list1));
		commonElements.retainAll(Arrays.asList(list2));

		Map<String, Integer> indicesOfList1 = mapOfList(list1);
		Map<String, Integer> indicesOfList2 = mapOfList(list2);

		for (String commonElement : commonElements) {
			int index1 = indicesOfList1.get(commonElement);
			int index2 = indicesOfList2.get(commonElement);
			elementsIndexSum.put(commonElement, index1 + index2);
		}

		int minIndexSum = elementsIndexSum.values().stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);

		elementsIndexSum.entrySet().stream().filter(entry -> entry.getValue() == minIndexSum)
				.forEach(entry -> System.out.println("Common String with least Index Sum: " + entry.getKey()));
	}

	public static Map<String, Integer> mapOfList(String[] array) {
		Map<String, Integer> indexMap = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			indexMap.put(array[i], i);
		}
		return indexMap;
	}
}
