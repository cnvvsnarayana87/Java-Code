// Program to return a new Array after removing first and last elements of an Array.
package firpac;

import java.util.ArrayList;

public class ArrayModifier {

    public static void main(String[] args) {
        int[] originalArray = {11, 12, 13, 14, 15, 16};
        ArrayList<Integer> modifiedList = removeFirstAndLast(originalArray);
        System.out.println(modifiedList);
    }

    public static ArrayList<Integer> removeFirstAndLast(int[] arr) {
        ArrayList<Integer> modifiedList = new ArrayList<>();
        for (int i = 1; i < arr.length - 1; i++) {
            modifiedList.add(arr[i]);
        }
        return modifiedList;
    }
}

