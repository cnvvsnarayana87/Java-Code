// Program to find non-repetitive characters in a string using HashMap.
package firpac;

import java.util.HashMap;
import java.util.Map;

public class NonRepHMap {

    public static void main(String[] args) {
        String inputString = "Sunset glow on the horizon";
        String nonRepetitiveChars = findNonRepetitiveChars(inputString);
        System.out.println("Non-repetitive characters in the string: " + nonRepetitiveChars);
    }

    public static String findNonRepetitiveChars(String inputString) {
        String lowerCaseString = inputString.toLowerCase();
        char[] charArray = lowerCaseString.replace(" ", "").toCharArray();
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char ch : charArray) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : charArray) {
            if (charFrequencyMap.get(ch) == 1) {
                result.append(ch).append(" ");
            }
        }

        return result.toString().trim();
    }
}

