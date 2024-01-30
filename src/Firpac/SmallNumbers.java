package firpac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallNumbers {

	public static void main(String[] args) {
		int[] nums = { 8, 1, 2, 2, 3 };

		int[] numsClone = nums.clone();
		Arrays.sort(numsClone);

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numsClone.length; i++) {
			map.putIfAbsent(numsClone[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			numsClone[i] = map.get(nums[i]);
		}
		System.out.println(Arrays.toString(numsClone));
	}
}
