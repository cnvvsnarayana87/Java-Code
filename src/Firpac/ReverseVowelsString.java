package firpac;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsString {

	public static void main(String[] args) {
		String inputString = "leetcode";
		String vowelsReversedString = findVowelsReversedString(inputString);
		System.out.println("String after reversing the vowels : " + vowelsReversedString);
	}

	public static String findVowelsReversedString(String inputString) {
		String vowels = "aeiouAEIOU";
		Set<Character> vowelsSet = new HashSet<>();
		for (int i = 0; i < vowels.length(); i++) {
			vowelsSet.add(vowels.charAt(i));
		}
		
		StringBuilder inputStringVowels = new StringBuilder();
		for (int i = 0; i < inputString.length(); i++) {
			if (vowelsSet.contains(inputString.charAt(i))) {
				inputStringVowels.append(inputString.charAt(i));
			}
		}
		
		StringBuilder vowelsReversedString = new StringBuilder();
		int j = 1;
		for (int i = 0; i < inputString.length(); i++) {
			if (vowelsSet.contains(inputString.charAt(i))) {
				vowelsReversedString.append(inputStringVowels.charAt(inputStringVowels.length() - j));
				j++;
			} else {
				vowelsReversedString.append(inputString.charAt(i));
			}
		}
		return vowelsReversedString.toString();
	}
}
