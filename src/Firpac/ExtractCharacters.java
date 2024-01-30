// Extract last 4 characters of any String

package firpac;

public class ExtractCharacters {

    public static void main(String[] args) {
        String inputString = "Automation Testing";
        String result = extractLastCharacters(inputString, 4);
        System.out.println(result);
    }

    public static String extractLastCharacters(String input, int count) {
        String normalizedString = input.replace(" ", "").toLowerCase();
        char[] charArray = normalizedString.toCharArray();
        int charLength = charArray.length;
        int startIndex = charLength - count;
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = startIndex; i < charLength; i++) {
            resultBuilder.append(charArray[i]);
        }

        return resultBuilder.toString();
    }
}

