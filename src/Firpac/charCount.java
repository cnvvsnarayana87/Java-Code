// Find a count of each character in a given String.
package Firpac;

import java.util.HashMap;
import java.util.Map;

public class charCount {

	public static void main(String[] args) {
		int charCount;
		String str = "Automation Testing";
		String nsStr = str.replace(" ", "");
		String lStr = nsStr.toLowerCase();
		char[] charStr = lStr.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < charStr.length; i++) {
			charCount = 0;
			for (int j = 0; j < charStr.length; j++) {
				if (charStr[i] == charStr[j]) {
					charCount++;
				}
				map.put(charStr[i], charCount);
			}
		}
		System.out.println(map);
	}
}
