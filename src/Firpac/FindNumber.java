// Finding number in an Array and ArrayList
package firpac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FindNumber {

    public static void main(String[] args) {
        // Finding numbers in an Array
        int[] arrayNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] findNumbersArray = { 3, 1, 7 };

        for (int i = 0; i < findNumbersArray.length; i++) {
            int numberToFind = findNumbersArray[i];
            if (IntStream.of(arrayNumbers).anyMatch(num -> num == numberToFind)) {
                System.out.println(numberToFind + " exists in arrayNumbers");
            }
        }

        // Finding numbers in an ArrayList
        ArrayList<Integer> arrayListNumbers = new ArrayList<>(Arrays.asList(51, 52, 53, 54, 55, 56, 57, 58, 59));
        int[] findNumbersArrayList = { 53, 62, 58 };

        for (int i = 0; i < findNumbersArrayList.length; i++) {
            int numberToFind = findNumbersArrayList[i];
            if (arrayListNumbers.contains(numberToFind)) {
                System.out.println(numberToFind + " exists in arrayListNumbers");
            }
        }
    }
}


