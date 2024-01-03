package firpac;

public class ElementEqualOrGreater {

	public static void main(String[] args) {
		int[] numbersArray = { 3, 9, 7, 8, 3, 8, 6, 6 };
		int specialArray = findSpecialArray(numbersArray);
		System.out.println("Values greater than or equal to are : " + specialArray);
	}

	public static int findSpecialArray(int[] numbersArray) {

		int[] count = new int[numbersArray.length + 1];
		for (int number : numbersArray) {
			if (number >= numbersArray.length) {
				count[numbersArray.length]++;
			} else {
				count[number]++;
			}
		}
	
		int result = 0;
		for (int i = count.length - 1; i >= 0; i--) {
			result += count[i];
			if (i == result) {
				return i;
			}
		}
		return -1;
	}
}
