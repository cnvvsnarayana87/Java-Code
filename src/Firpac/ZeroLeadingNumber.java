// Program to generate a string after moving zeros to the front.
package firpac;

import java.util.stream.IntStream;

public class ZeroLeadingNumber {

	public static void main(String[] args) {
		String numeral = "1500840023";
		System.out.println("String after moving zeros to the front : " + generateZeroLeadingNumber(numeral));
	}

	public static String generateZeroLeadingNumber(String numeral) {
		StringBuilder expectedResult = new StringBuilder();
		int[] zeroLeadingArray = new int[numeral.length()];
		int zeroCount = (int) numeral.codePoints().filter(ch -> ch == '0').count();
		int j = 0;
		int k = zeroCount;
		for (int i = 0; i < numeral.length(); i++) {
			if (numeral.charAt(i) == '0') {
				zeroLeadingArray[j] = '0';
				j++;
			} else {
				zeroLeadingArray[k] = numeral.charAt(i);
				k++;
			}
		}
		IntStream.range(0, zeroLeadingArray.length).forEach(i -> expectedResult.appendCodePoint(zeroLeadingArray[i]));
		return expectedResult.toString();
	}
}
