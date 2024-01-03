package firpac;

import java.util.Arrays;

public class NumbersEqualOrGreater {

	public static void main(String[] args) {
		int[] numbersArray = { 3, 6, 7, 7, 0 };// { 3, 9, 7, 8, 3, 8, 6, 6 };
		int specialArray = findSpecialArray(numbersArray);
		System.out.println("Values greater than or equal to are : " + specialArray);
	}

	public static int findSpecialArray(int[] nums) {

		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int length = nums.length;
		System.out.println(length);
		for (int i = 0; i < length; i++) {
			if (nums[i] >= length - i) {
				return length - i;
			}
		}
		return -1;
	}
}
