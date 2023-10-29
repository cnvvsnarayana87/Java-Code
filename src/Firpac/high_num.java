//Find out highest numbers in an Array whose adjacent right numbers are smaller
package firpac;

public class high_num {

	public static void main(String[] args) {
		int[] num = { 1, 2, 4, 3, 5, 2 };

		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] > num[i + 1]) {
				System.out.println(num[i]);
			}
		}
		if (num[num.length - 1] > num[0]) {
			System.out.println(num[num.length - 1]);
		}

	}

}
