// Program to Sort Words of a Sentence.
package firpac;

public class SortingWords {

	public static void main(String[] args) {
		String inputString = "It's not the load that breaks you down, it's the way you carry it.";
		String[] words = inputString.split(" ");
		StringBuilder sortedString = new StringBuilder();
		for (String word : words) {
			String sortedWord = sortString(word);
			sortedString.append(sortedWord + " ");
		}
		System.out.println(sortedString);
	}

	public static String sortString(String word) {

		StringBuilder expectedString = new StringBuilder();
		int count = 0;
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < word.length(); j++) {
				if ('a' + i == word.codePointAt(j)) {
					expectedString.appendCodePoint('a' + i);
				} else if ('A' + i == word.codePointAt(j)) {
					expectedString.appendCodePoint('A' + i);
				} else if ('0' + i == word.codePointAt(j) && Character.isDigit(word.codePointAt(j))) {
					expectedString.appendCodePoint('0' + i);
				} else if (!Character.isLetterOrDigit(word.codePointAt(j)) && count < 1) {
					expectedString.appendCodePoint(word.codePointAt(j));
					count++;
				}
			}
		}
		return expectedString.toString();
	}
}
