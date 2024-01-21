package firpac;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfString {

	public static void main(String[] args) {
		String inputString = "Hello";
		String vowelsReversedString = findVowelsReversedString(inputString);
		System.out.println("String after reversing the vowels : "+ vowelsReversedString);
	}

	public static String findVowelsReversedString(String inputString) {
		String vowels = "aeiouAEIOU";
		Set<Character> vowelsSet = new HashSet<>();
		for (int i = 0; i < vowels.length(); i++) {
			vowelsSet.add(vowels.charAt(i));
		}
		char[] charInputArray = inputString.toCharArray();
		int start = 0;
		int end = inputString.length() - 1;
		while (start < end) {
			while (start < end && !vowelsSet.contains(charInputArray[start])) {
				start++;
			}
			while (start < end && !vowelsSet.contains(charInputArray[end])) {
				end--;
			}
			if (start < end) {
				char temp = charInputArray[start];
				charInputArray[start] = charInputArray[end];
				charInputArray[end] = temp;
				start++;
				end--;
			}
		}
		String vowelsReversedString = new String(charInputArray);
		return vowelsReversedString;
	}
}
