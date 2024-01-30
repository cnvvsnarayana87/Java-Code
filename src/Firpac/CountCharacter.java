// Program to identify the count of a letter in the sentence
package firpac;

public class CountCharacter {

	public static void main(String[] args) {
		String inputString = "Automation Testing";
		char targetCharacter = 'a';
		System.out.println("Count of Character : " + countOccurrences(inputString, targetCharacter));
	}

	public static int countOccurrences(String inputString, char targetCharacter) {
		int count = 0;
		String lowercaseInput = inputString.toLowerCase();
		char lowercaseTarget = Character.toLowerCase(targetCharacter);
		char[] characters = lowercaseInput.toCharArray();

		for (char currentChar : characters) {
			if (currentChar == lowercaseTarget) {
				count++;
			}
		}
		return count;
	}
}
