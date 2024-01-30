// Program to convert the first and last letter of each word in a string to uppercase.
package firpac;

public class FirstAndLastLetterUppercase {

    public static void main(String[] args) {
        String inputSentence = "success is not final, failure is not fatal: it is the courage to continue that counts.";
        String modifiedSentence = convertFirstAndLastLetterToUppercase(inputSentence);
        System.out.println(modifiedSentence);
    }

    public static String convertFirstAndLastLetterToUppercase(String input) {
        String[] words = input.split(" ");
        StringBuilder modifiedSentenceBuilder = new StringBuilder();

        for (String word : words) {
            int wordLength = word.length();

            if (wordLength == 1) {
                modifiedSentenceBuilder.append(word.toUpperCase()).append(" ");
            } else if (!Character.isAlphabetic(word.charAt(wordLength - 1))) {
                wordLength = word.length() - 1;
                char[] charArray = word.toCharArray();
                charArray[0] = Character.toUpperCase(charArray[0]);
                charArray[wordLength - 1] = Character.toUpperCase(charArray[wordLength - 1]);
                modifiedSentenceBuilder.append(charArray).append(" ");
            } else {
                char firstChar = Character.toUpperCase(word.charAt(0));
                char lastChar = Character.toUpperCase(word.charAt(wordLength - 1));
                modifiedSentenceBuilder.append(firstChar).append(word, 1, wordLength - 1).append(lastChar).append(" ");
            }
        }

        return modifiedSentenceBuilder.toString().trim();
    }
}

