// Minimum and Maximum element in an Array using sort method
package Firpac;

import java.util.Arrays;

public class Minmax {

	public static void main(String[] args) {
		
		int[] numArr = {7, 11, 6, 55, 98, 45, 16, 96, 46};
		
		Arrays.sort(numArr);
		
		String sorArr = Arrays.toString(numArr);
		int minNum = numArr[0];
		int maxNum = numArr[numArr.length-1];
		
		System.out.println("Sorted Array : "+sorArr);
		System.out.println("Minimum element in an Array : "+minNum);
		System.out.println("Maximum element in an Array : "+maxNum);
	}
}
		
		 

