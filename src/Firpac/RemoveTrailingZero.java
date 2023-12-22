package firpac;

import java.util.stream.IntStream;

public class RemoveTrailingZero {

	public static void main(String[] args) {
		String inputNumber = "51230100";
		System.out.println("String without trailing zeros : " + removeTrailingZeros(inputNumber));
	}

	public static String removeTrailingZeros(String inputNumber) {
		int length = inputNumber.length();
		int zeroCount = 
		String result = inputNumber.substring(0, length - zeroCount);
		return result;
	}
}
