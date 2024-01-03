package firpac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ThirdMaximumNum {

	public static void main(String[] args) {
		int[] numberArray = { 1, 2, -2147483648 };
		int thirdMaximumNum = findThirdMaximumNum(numberArray);
		System.out.println("Third Maximum Number : " + thirdMaximumNum);
	}

	public static int findThirdMaximumNum(int[] numberArray) {
		int result = 0;
		Set<Integer> uniqueNumbers = new TreeSet<>(Comparator.reverseOrder());
		for (int num : numberArray) {
			uniqueNumbers.add(num);
		}
		if (uniqueNumbers.size() < 3) {
			result = Arrays.stream(numberArray).max().getAsInt();
		} else {
			int i = 0;
			for (int num : uniqueNumbers) {
				i++;
				result = num;
				if (i == 3) {
					break;
				}
			}
		}
		return result;
	}
}
