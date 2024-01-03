package firpac;

public class MinimumComValue {

	public static void main(String[] args) {
		int[] firstArray = { 1, 2, 3 };
		int[] secondArray = { 2, 4 };
		int minCommonValue = findMinCommonValue(firstArray, secondArray);
		System.out.println("Minimum common value : " + minCommonValue);
	}

	public static int findMinCommonValue(int[] firstArray, int[] secondArray) {
		int length = Math.max(firstArray.length, secondArray.length);
		int i = 0;
		int j = 0;
		int k = 0;
		while (k < length) {
			if (firstArray[i] > secondArray[secondArray.length - 1]) {
				return -1;
			} else if (secondArray[j] > firstArray[firstArray.length - 1]) {
				return -1;
			}
			if (firstArray[i] == secondArray[j]) {
				return firstArray[i];
			} else if (firstArray[i] < secondArray[j]) {
				i++;
			} else {
				j++;
			}
		}
		return -1;
	}
}
