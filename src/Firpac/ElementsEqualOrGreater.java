package firpac;

public class ElementsEqualOrGreater {

	public static void main(String[] args) {
		int[] numbersArray = { 0, 4, 3, 0, 4 };
		int specialArray = findSpecialArray(numbersArray);
		System.out.println("Values greater than or equal to are : " + specialArray);
	}

	public static int findSpecialArray(int[] numbersArray) {

		int length = numbersArray.length;
		for (int i = length; i >= 1; i--) {
			int count = 0;
			for (int j = 1; j <= length; j++) {
				if (numbersArray[j - 1] >= i) {
					count++;
				}
				if ((length - j) + count < i) {
					break;
				}
			}
			if (i == count) {
				return count;
			}
		}
		return -1;
	}
}

