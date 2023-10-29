// Program to identify the count of a letter in the sentence
package firpac;

public class letter_find {

	public static void main(String[] args) {

		String str = "Automation Testing";
		char ch = 'a';
		System.out.println(total(str, ch));
	}

	public static int total(String str, char ch) {
		int count = 0;
		String lStr = str.toLowerCase();
		char lch = Character.toLowerCase(ch);
		char[] charStr = lStr.toCharArray();
		for (char C : charStr) {
			if (C == lch) {
				count++;
			}
		}
		return count;
	}
}
