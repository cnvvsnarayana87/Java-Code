package firpac;

public class IsomorphicString {

	public static void main(String[] args) {
		String firstString = "badc";
		String secondString = "baba";

		if (firstString.length() != secondString.length()) {
			System.out.println("Given Strings are not Isomorphic");
		} else {
			boolean isomorphicStrings = isIsomorphicString(firstString, secondString);
			System.out.println("Given Strings are Isomorphic : " + isomorphicStrings);
		}
	}

	public static boolean isIsomorphicString(String firstString, String secondString) {
		int[] charMapFirstString = new int[128];
		int[] charMapSecondString = new int[128];

		for (int i = 0; i < firstString.length(); i++) {
			if (charMapFirstString[firstString.charAt(i)] != charMapSecondString[secondString.charAt(i)]) {
				return false;
			}
			charMapFirstString[firstString.charAt(i)] = i + 1;
			charMapSecondString[secondString.charAt(i)] = i + 1;
		}
		return true;
	}
}
