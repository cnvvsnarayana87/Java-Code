/* Given an array of integers, find the indices of two numbers that add up to a specific target. 
 * Assume each input has exactly one solution, and the same element cannot be used twice.*/
package firpac;

import java.util.ArrayList;

public class TwoSum {

    public static void main(String[] args) {
        int[] numberArray = { 7, 11, 6, 55, 98, 45, 16, 96, 46 };
        int targetSum = 22;

        ArrayList<Integer> uniqueNumbers = findUniqueNumbers(numberArray);
        ArrayList<Integer> indicesOfSum = findIndicesOfSum(uniqueNumbers, targetSum);

        if (indicesOfSum.size() == 2) {
            System.out.println("Indices of the two numbers : " + indicesOfSum.get(0) + " , " + indicesOfSum.get(1));
        } else {
            System.out.println("No two numbers add up to the target");
        }
    }

    public static ArrayList<Integer> findUniqueNumbers(int[] array) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!uniqueNumbers.contains(array[i])) {
                uniqueNumbers.add(array[i]);
            }
        }
        return uniqueNumbers;
    }

    public static ArrayList<Integer> findIndicesOfSum(ArrayList<Integer> numbers, int targetSum) {
        ArrayList<Integer> indicesOfSum = new ArrayList<>();
        for (int j = 0; j < numbers.size(); j++) {
            int secondNumber = targetSum - numbers.get(j);
            if (numbers.contains(secondNumber) && secondNumber != numbers.get(j)) {
                indicesOfSum.add(j);
                indicesOfSum.add(numbers.indexOf(secondNumber));
                break;
            }
        }
        return indicesOfSum;
    }
}

