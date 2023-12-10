package firpac;

import java.util.Arrays;

public class MaximumOddNumber {

	public static void main(String[] args) {
		String number = "01010";
		String maxNumber = findMaxOddBinaryNumber(number);
		System.out.println(maxNumber);
	}

	public static String findMaxOddBinaryNumber(String number) {
		 int oneCount = (int) number.chars().filter(ch -> ch == '1').count();

	        String maxNumber = number.chars()
	                .mapToObj(ch -> (char) ch)
	                .limit(oneCount + 1)
	                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
	                .toString();

	        return maxNumber;
	}
}
