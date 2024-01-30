// Program to find non-repetitive characters in a string.
package firpac;

public class NonRepetitiveCharacters {

    public static void main(String[] args) {
        String inputString = "Sunset glow on the horizon";
        String lowercaseString = inputString.toLowerCase();
        char[] charArray = lowercaseString.replace(" ", "").toCharArray();

        String nonRepetitiveCharacters = findNonRepetitiveCharacters(charArray);

        System.out.println("First non-repetitive character: " + nonRepetitiveCharacters.charAt(0));
        System.out.println("Non-repetitive characters in a string: " + nonRepetitiveCharacters);
    }

    public static String findNonRepetitiveCharacters(char[] charArray) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            int charCount = 0;

            for (int j = 0; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    charCount++;
                }
            }

            if (charCount == 1) {
                result.append(charArray[i]);
            }
        }

        return result.toString();
    }
}

