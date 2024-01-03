package firpac;

import java.util.Arrays;

public class SortWithoutInbuilt {

	public static void main(String[] args) {
		int[] num = { 8, 4, 10, 3, 6, 18, 13 };
		int length = num.length;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (j + 1 < length && num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}

}
