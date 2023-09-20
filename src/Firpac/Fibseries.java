// Fibonacci Series using Arrays
package Firpac;

import java.util.Arrays;
import java.util.Scanner;

public class Fibseries {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("How many Fib numbers : ");

		if (input.hasNextInt()) {
			int num = input.nextInt();
			if (num == 0) {
				System.out.println("Enter a valid Integer above '0'");
			} else if (num == 1) {
				System.out.println(num - 1);
			} else {
				int[] fibArr = new int[num];
				fibArr[0] = 0;
				fibArr[1] = 1;
				int i = 0;
				while (i < num - 2) {
					fibArr[i + 2] = fibArr[i] + fibArr[i + 1];
					i++;
				}
				System.out.println(Arrays.toString(fibArr));
			}
		} else {
			System.out.println("Enter valid credentials");
		}
	input.close();
	}
}
