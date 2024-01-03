// Program to Find the Index of the First Occurrence in a String.
package firpac;

public class FirstOccurrence {

	public static void main(String[] args) {

		String haystack = "sabutsad";
		String needle = "but";
		int indexOccurrence = findIndexOccurrence(haystack, needle);
		System.out.println("First occurrence is at index : " + indexOccurrence);
	}

	public static int findIndexOccurrence(String haystack, String needle) {
		return haystack.indexOf(needle);
	}
}
