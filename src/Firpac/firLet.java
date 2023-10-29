// First letter of each word present in String.

package firpac;

public class firLet {

	public static void main(String[] args) {
		String str = "It's not the load that breaks you down, it's the way you carry it.";
		String[] arrStr = str.split(" ");
		
		for (int i = 0; i < arrStr.length; i++) {
			char fChar = arrStr[i].charAt(0);
			System.out.println(fChar);
		}
	}
}
