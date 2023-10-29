// Sorting of an Array 
package firpac;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Sor_arr {
	public static void main(String[] args) {

		// Sorted using a loop
		int[] numArr = { 7, 11, 6, 55, 98, 45, 16, 96, 46 };
		int[] sorArr = new int[numArr.length];
		for (int i = 0; i < numArr.length; i++) {
			int count = 0;
			for (int j = 0; j < numArr.length; j++) {
				int newNum = numArr[j];
				if (numArr[i] > newNum) {
					count++;
				}
			}sorArr[count] = numArr[i];
		}
		System.out.println("Sorted using a loop : "+Arrays.toString(sorArr));
		
		// Sorted using Sort method
		int[] nNumArr = { 7, 11, 6, 55, 98, 45, 16, 96, 46 };
		Arrays.sort(nNumArr);
		System.out.println("Sorted using the sort method : "+Arrays.toString(nNumArr));
		
		// Sorted using TreeSet class of Set interface
		Set<Integer> sorSet = new TreeSet<>(Arrays.asList(7, 11, 6, 55, 98, 45, 16, 96, 46));
		System.out.println("Sorted using a set : "+sorSet);
	}
}