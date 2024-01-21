package firpac;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] numberArray = { 1, 0, 1, 1, 0, 1 };
		int maxConsecutiveOnes = findMaxConsecutiveOnes(numberArray);
		System.out.println("Maximum consecutive Ones : " + maxConsecutiveOnes);
	}

	public static int findMaxConsecutiveOnes(int[] numberArray) {

		int countOnes = 0;
		int maxOnes = 0;
		for (int number : numberArray) {
			if (number == 1) {
				countOnes++;
			} else {
				countOnes = 0;
			}
			if (countOnes > maxOnes) {
				maxOnes = countOnes;
			}
		}
		return maxOnes;
	}
}
