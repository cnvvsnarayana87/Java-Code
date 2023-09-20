// Program to find non-repetitive characters in a string.
package Firpac;

public class NonRepChar {

	public static void main(String[] args) {

		String str = "Sunset glow on the horizon";
		String lStr = str.toLowerCase();
		char[] charStr = lStr.replace(" ", "").toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < charStr.length; i++) {
			int charCount = 0;
			for (int j = 0; j < charStr.length; j++) {
				if (charStr[i] == charStr[j]) {
					charCount++;
				}
			}
			if (charCount == 1) {
				sb.append(charStr[i]);
			}
		}
		System.out.println("First non-repetitive character : " + sb.charAt(0));
		System.out.println("Non-repetitive characters in a string : " + sb);
	}
}
