package firpac;

public class CountPair {

	public static void main(String[] args) {

		int[] numbersArray = { -6, 2, 5, -2, -7, -1, 3 };
		int target = -2;
		int count = 0;
		for (int i = 0; i < numbersArray.length; i++) {
			for (int j = i + 1; j < numbersArray.length; j++) {
				if (numbersArray[i] + numbersArray[j] < target) {
					count++;
				}
			}
		}
		System.out.println("Count of Pairs Whose Sum is Less than the Target : " + count);
	}
}
