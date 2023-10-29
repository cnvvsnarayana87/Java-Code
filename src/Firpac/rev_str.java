// Reversal of String

package firpac;

public class rev_str {

	public static void main(String[] args) {
		String str = "testing";
		char[] charStr = str.toCharArray();
		System.out.println(charStr);
		int charStrLen = charStr.length;
		StringBuilder sb = new StringBuilder();
		for(int i = charStrLen-1; i >= 0; i--) {
			sb.append(charStr[i]);	
		}
		String revStr = sb.toString();
		System.out.println(revStr);
	}	
}
		
		
