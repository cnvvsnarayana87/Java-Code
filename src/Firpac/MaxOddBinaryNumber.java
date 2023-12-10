// Program to Find the Maximum Odd Binary Number.
package firpac;

public class MaxOddBinaryNumber {

	public static void main(String[] args) {
		String numberString = "0101010";
		String maxNumber = findMaxOddBinaryNumber(numberString);
		System.out.println("Maximum Odd Binary Number: " + maxNumber);
	}

	public static String findMaxOddBinaryNumber(String numberString) {
		StringBuilder maxNumber = new StringBuilder();
		int length = numberString.length();
		int oneCount = (int) numberString.codePoints().filter(ch -> ch == '1').count();
		for (int i = 0; i < length; i++) {
			if (i < oneCount - 1 || i == length - 1) {
				maxNumber.append('1');
			} else {
				maxNumber.append('0');
			}
		}
		return maxNumber.toString();
	}
}
