// Program to Find the Index of the First Occurrence in a String
package firpac;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InitialOccurrence {

	public static void main(String[] args) {

		String haystack = "sabutsad";
		String needle = "sad";
		int indexOccurrence = findIndexOccurrence(haystack, needle);
		System.out.println("First occurrence is at index : " + indexOccurrence);
	}

	public static int findIndexOccurrence(String haystack, String needle) {

		Pattern stringPattern = Pattern.compile(needle);
		Matcher match = stringPattern.matcher(haystack);

		if (match.find()) {
			return match.start();
		} else {
			return -1;
		}
	}
}
