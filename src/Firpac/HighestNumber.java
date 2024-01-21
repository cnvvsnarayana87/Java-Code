package firpac;

public class HighestNumber {

	public static void main(String[] args) {
		int num = 560;
		int digit = 9;
		int highestNumber = findHighestNumber(num, digit);
		System.out.println(highestNumber);
	}

	public static int findHighestNumber(int num, int digit) {
		String numStr = String.valueOf(num);
		String digitStr = String.valueOf(digit);
		String str = numStr + digitStr;
		String expStr = "";

		for (int i = 9; i >= 0; i--) {
			for (int j = 0; j < str.length(); j++) {
				if ('0' + i == str.charAt(j)) {
					expStr += str.charAt(j);
				}
			}
		}
		int result = Integer.parseInt(expStr);
		return result;
	}
}
