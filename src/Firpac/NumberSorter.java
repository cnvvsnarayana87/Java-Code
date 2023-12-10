// Program to sort a string of numerical characters.
package firpac;

public class NumberSorter {

	public static void main(String[] args) {
		String numberString = "010302406907";
		String sortedNumberString = generateAscNumber(numberString);
		System.out.println("Sorted numerical String : " + sortedNumberString);
	}

	public static String generateAscNumber(String numberString) {
		StringBuilder expectedResult = new StringBuilder();
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j < numberString.length(); j++) {
				if ('0' + i == numberString.charAt(j)) {
					expectedResult.append(numberString.charAt(j));
				}
			}
		}
		return expectedResult.toString();
	}
}
