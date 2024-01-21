package firpac;

import java.util.Arrays;

public class SmallerNumbers {

	public static void main(String[] args) {
		int[] nums = { 8, 1, 2, 2, 3 };
		int[] expectedResult = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			int count = 0;
			for(int j = 0; j < nums.length; j++) {
				if(i != j && nums[i] > nums[j]) {
					count++;
				}
				expectedResult[i] = count;
			}
		}
		System.out.println(Arrays.toString(expectedResult));
	}
}
