// Check if the input is a palindrome.
package firpac;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input : ");
		if (scanner.hasNextInt()) {
			int inputNumber = scanner.nextInt();
			checkIntPalindrome(inputNumber);
		} else {
			String inputString = scanner.nextLine();
			checkStringPalindrome(inputString);
		}
		scanner.close();
	}
	
	public static void checkIntPalindrome(int num) {
		if (num <= 0) {
			System.out.println("Enter Valid Input greater than '0'");
		} else {
			int expectedNum = num;
			int actualNum = 0;
			while (num != 0) {
				int sum = num % 10;
				actualNum = actualNum * 10 + sum;
				num = num / 10;
			}
			if (expectedNum == actualNum) {
				System.out.println("The Entered Integer is Palindrome");
			} else {
				System.out.println("The Entered Integer is not Palindrome");
			}
		}
	}
	
	public static void checkStringPalindrome(String str) {
		String lowerCaseStr = str.toLowerCase();
		String reversedString = new StringBuilder(lowerCaseStr).reverse().toString();
		
		if (lowerCaseStr.equals(reversedString)) {
			System.out.println("The Entered String is Palindrome");
		} else {
			System.out.println("The Entered String is not a Palindrome");
		}
	}
}

