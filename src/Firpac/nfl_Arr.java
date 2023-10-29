// Program to return a new Array after removing first and last elements of an Array.
package firpac;

import java.util.ArrayList;

public class nfl_Arr {

	public static void main(String[] args) {

		int[] arr = { 11, 12, 13, 14, 15, 16 };
		
		ArrayList<Integer> arrLis = new ArrayList<>();
		for (int i = 1; i < arr.length - 1; i++) {
			arrLis.add(arr[i]);
		}
		System.out.println(arrLis);
	}
}
