// Extract last 4 characters of any String
package firpac;

public class last_char {

	public static void main(String[] args) {
		String str = "Automation Testing";
		String nlStr = str.replace(" ", "").toLowerCase();
		char[] charStr = nlStr.toCharArray();
		int charLen = charStr.length;
		int charMax = charLen - 4;
		StringBuilder sb = new StringBuilder();
		for (int i = charLen - 1; i >= charMax; i--) {
			sb.append(charStr[i]);
		}
		sb.reverse();
		System.out.println(sb);
	}
}







