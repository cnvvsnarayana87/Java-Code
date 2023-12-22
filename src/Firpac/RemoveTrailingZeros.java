package firpac;

public class RemoveTrailingZeros {

	public static void main(String[] args) {
		String inputNumber = "51230100";
		System.out.println("String without trailing zeros : " + removeTrailingZeros(inputNumber));
	}

	public static String removeTrailingZeros(String number) {
		int zeroCount = 0;
		int length = number.length();
		for (int i = length - 1; i >= 0; i--) {
			if (number.charAt(i) == '0') {
				zeroCount++;
			} else {
				break;
			}
		}
		String result = number.substring(0, length - zeroCount);
		return result;
	}
}
