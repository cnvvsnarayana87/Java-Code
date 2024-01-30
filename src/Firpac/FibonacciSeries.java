// Fibonacci Series using Arrays
package firpac;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers: ");

        if (input.hasNextInt()) {
            int num = input.nextInt();
            if (num == 0) {
                System.out.println("Enter a valid integer above '0'");
            } else if (num == 1) {
                System.out.println(generateFibonacciSeries(num));
            } else {
                System.out.println(Arrays.toString(generateFibonacciSeries(num)));
            }
        } else {
            System.out.println("Enter valid credentials");
        }
        input.close();
    }

    public static int[] generateFibonacciSeries(int n) {
        int[] fibArr = new int[n];
        fibArr[0] = 0;
        if (n > 1) {
            fibArr[1] = 1;
            for (int i = 2; i < n; i++) {
                fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
            }
        }
        return fibArr;
    }
}

