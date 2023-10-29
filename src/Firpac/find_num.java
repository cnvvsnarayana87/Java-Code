// Finding number in an Array and ArrayList
package firpac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class find_num {

	public static void main(String[] args) {
		// Finding number in Array
		int[] aNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] fNum = { 3, 1, 7 };
		for (int i = 0; i < fNum.length; i++) {
			int fiNum = fNum[i];
			if (IntStream.of(aNum).anyMatch(num -> num == fiNum)) {
				System.out.println(fiNum + " exists in aNum");
			}
		}

		// Finding number in ArrayList
		ArrayList<Integer> alNum = new ArrayList<>(Arrays.asList(51, 52, 53, 54, 55, 56, 57, 58, 59));
		int[] falNum = { 53, 62, 58 };
		for (int i = 0; i < falNum.length; i++) {
			if (alNum.contains(falNum[i])) {
				System.out.println(falNum[i] + " exists in alNum");
			}
		}

	}

}
