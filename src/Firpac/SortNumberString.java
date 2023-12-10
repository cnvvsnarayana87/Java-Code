// Program to sort a string of numerical characters.
package firpac;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortNumberString {

	public static void main(String[] args) {
		String numberString = "20175096334";
		String ascNumberString = generateAscNumber(numberString);
		System.out.println("Sorted numerical String :" + ascNumberString);
	}

	public static String generateAscNumber(String numberString) {
		return IntStream.rangeClosed(0, 9).mapToObj(
				i -> String.valueOf(i).repeat((int) (numberString.codePoints().filter(c -> c == '0' + i)).count()))
				.collect(Collectors.joining());
	}
}
