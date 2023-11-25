package firpac;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = { 1, 2, 3 };
		int[] expectedDigits = plusOne(digits);
		System.out.println("Array after incrementing by one : " + Arrays.toString(expectedDigits));
	}

	public static int[] plusOne(int[] digits) {

		int length = digits.length;
		if (digits[length - 1] != 9) {
			digits[length - 1] = digits[length - 1] + 1;
			return digits;
		}
		int i = length - 1;
		while (i >= 0) {
			if (digits[i] == 9) {
				digits[i] = 0;
			} else if (digits[i] != 9) {
				digits[i] = digits[i] + 1;
				break;
			}
			i--;
		}
		if (i == -1) {
			int[] newDigit = new int[length + 1];
			newDigit[0] = 1;
			return newDigit;
		}
		return digits;
	}
}
