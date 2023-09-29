// ZigZag Conversion Program in Java
package Firpac;

import java.util.ArrayList;
import java.util.List;

public class ZigZagCoversion {

	public static void main(String[] args) {
		String inputString = "PAYPALISHIRING";
		System.out.println("Input String : " + inputString);
		char[] charInputString = inputString.toCharArray();
		StringBuilder wordOfRow = new StringBuilder();
		StringBuilder resultString = new StringBuilder();
		List<String> rowWordsList = new ArrayList<>();
		int numOfRows = 3;

		for (int i = 0; i < numOfRows; i++) {
			wordOfRow.setLength(0);
			int k = i + 1;
			int j = i;
			while (j < charInputString.length) {
				wordOfRow.append(charInputString[j]);
				j = j + numOfRows;
			}
			System.out.println("Row " + k + " : " + wordOfRow);
			rowWordsList.add(wordOfRow.toString());
		}

		for (String string : rowWordsList) {
			resultString.append(string);
		}
		System.out.println("Output after ZigZag conversion : " + resultString);
	}
}
