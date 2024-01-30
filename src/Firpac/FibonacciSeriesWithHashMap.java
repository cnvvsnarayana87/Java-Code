// Fibonacci Series using HashMap
package firpac;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciSeriesWithHashMap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers: ");

        if (input.hasNextInt()) {
            int num = input.nextInt();
            printFibonacciSeries(num);
        } else {
            System.out.println("Enter a valid integer.");
        }

        input.close();
    }

    public static void printFibonacciSeries(int num) {
        Map<Integer, Integer> fibMap = new HashMap<>();
        fibMap.put(0, 0);
        fibMap.put(1, 1);

        for (int i = 2; i < num; i++) {
            int fibValue = fibMap.get(i - 1) + fibMap.get(i - 2);
            fibMap.put(i, fibValue);
        }

        for (int j = 0; j < num; j++) {
            System.out.print(fibMap.get(j) + " ");
        }
    }
}

