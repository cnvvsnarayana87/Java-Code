// Fibonacci Series using HashMap
package firpac;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibserHmap {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("How many Fib numbers : ");

		if (input.hasNextInt()) {
			int num = input.nextInt();
			Map<Integer, Integer> fibMap = new HashMap<>();
			fibMap.put(0, 0);
			fibMap.put(1, 1);
			int i = 0;
			while (i < num - 2) {
				int fibKVal = fibMap.get(i) + fibMap.get(i + 1);
				fibMap.put(i + 2, fibKVal);
				i++;
			}
			for (int j = 0; j < num; j++) {
				System.out.print(fibMap.get(j) + " ");
			}
		} else {
			System.out.println("Enter valid Integer");
		}
		input.close();
	}
}
