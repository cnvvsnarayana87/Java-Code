package firpac;

public class SortSentence {

	public static void main(String[] args) {
		String inputString = "aaannmmccbb";
		String sortedString = sortString(inputString);
		System.out.println("Sorted String : " +sortedString);
	}

	public static String sortString(String inputString) {

		String expectedString = "";
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < inputString.length(); j++) {
				if ('a' + i == inputString.charAt(j)) {
					expectedString = expectedString + inputString.charAt(j);
				}
			}
		}
		return expectedString;
	}
}
