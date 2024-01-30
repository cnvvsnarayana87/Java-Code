//Find out numbers in an Array whose adjacent right numbers are smaller
package firpac;


public class FindNumbersWithSmallerAdjacent {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 3, 5, 2};
        findNumbersWithSmallerAdjacent(numbers);
    }

    private static void findNumbersWithSmallerAdjacent(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                System.out.println(numbers[i]);
            }
        }
        if (numbers[numbers.length - 1] > numbers[0]) {
            System.out.println(numbers[numbers.length - 1]);
        }
    }
}


