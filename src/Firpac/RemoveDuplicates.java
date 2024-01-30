// Program to remove duplicates from a given array.

package firpac;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static Set<Integer> removeDuplicatesFromArray(int[] inputArray) {
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : inputArray) {
            uniqueSet.add(num);
        }

        return uniqueSet;
    }

    public static void main(String[] args) {
        int[] numberArray = {2, 3, 6, 5, 8, 2, 3};
        Set<Integer> uniqueNumbers = removeDuplicatesFromArray(numberArray);
        System.out.println(uniqueNumbers);
    }
}


