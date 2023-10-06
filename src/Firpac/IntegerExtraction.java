// Program for extracting integers.
package Firpac;

import java.util.ArrayList;
import java.util.List;

public class IntegerExtraction {

	public static void main(String[] args) {
		String inputString = "72 cats, X30 dogs, -100,20 points, 26 alphabets.";
		String[] words = inputString.replaceAll("[.,]", " ").split(" ");
		List<Integer> extractedIntegers = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {
			if (words[i].matches("-?\\d+")) {
				int extractedInt = Integer.parseInt(words[i]);
				extractedIntegers.add(extractedInt);
			}
		}
		System.out.println("Extracted Integers are  " + extractedIntegers);
	}
}
