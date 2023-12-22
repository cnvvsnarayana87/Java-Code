package firpac;

import java.util.ArrayList;
import java.util.List;

public class CharacterWords {

	public static void main(String[] args) {
		String[] words = { "abc", "bcd", "aaaa", "cbc" };
		char character = 'a';
		List<Integer> stringIndices = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].indexOf(character) != -1) {
				stringIndices.add(i);
			}
		}
		System.out.println("Indices of strings in the array containing the character : " + stringIndices);
	}
}
