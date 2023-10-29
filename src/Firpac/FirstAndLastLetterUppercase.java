// Program to convert the first and last letter of each word in a string to uppercase.
package firpac;

public class FirstAndLastLetterUppercase {

	public static void main(String[] args) {

		String inputSentence = "success is not final, failure is not fatal: it is the courage to continue that counts.";
		String[] Words = inputSentence.split(" ");
		StringBuilder modifiedSentenceBuilder = new StringBuilder();

		for (int i = 0; i < Words.length; i++) {

			int wordLength = Words[i].length();
			if (wordLength == 1) {
				modifiedSentenceBuilder.append(Words[i].toUpperCase()).append(" ");
			} else if (!Character.isAlphabetic(Words[i].charAt(wordLength - 1))) {
				wordLength = Words[i].length() - 1;
				char[] charArray = Words[i].toCharArray();
				charArray[0] = Character.toUpperCase(charArray[0]);
				charArray[wordLength - 1] = Character.toUpperCase(charArray[wordLength - 1]);
				modifiedSentenceBuilder.append(charArray).append(" ");
			} else {
				char firstChar = Character.toUpperCase(Words[i].charAt(0));
				char lastChar = Character.toUpperCase(Words[i].charAt(wordLength - 1));
				modifiedSentenceBuilder.append(firstChar).append(Words[i].substring(1, wordLength - 1)).append(lastChar)
						.append(" ");
			}
		}
		System.out.println(modifiedSentenceBuilder);
	}
}
