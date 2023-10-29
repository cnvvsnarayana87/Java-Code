// Program to remove duplicates from a given array.

package firpac;

import java.util.ArrayList;

public class remDup {

	public static void main(String[] args) {

		int[] arrNum = { 2, 3, 6, 5, 8, 2, 3 };
		ArrayList<Integer> alNum = new ArrayList<>();
		for (int i = 0; i < arrNum.length; i++) {
			if (!alNum.contains(arrNum[i])) {
				alNum.add(arrNum[i]);
			}
		}
		System.out.println(alNum);
	}
}

