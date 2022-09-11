package lesson5.hw;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] myArray = {3, 2, 12, 3, 1};
        System.out.println(Arrays.toString(sortAscending(myArray)));
        System.out.println(Arrays.toString(sortDescending(myArray)));

    }
    public static int[] sortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minimum = arr[i];
            int minimumIndex = i;
            for (int j = i + 1;  j < arr.length; j++) {
                if (arr[j] < minimum) {
                    minimum = arr[j];
                    minimumIndex = j;
                }
            }
            arr[minimumIndex] = arr[i];
            arr[i] = minimum;
        }
        return arr;
    }

    public static int[] sortDescending (int[] arr) {
        for (int i = 0; i < arr.length; i++ ) {
            int maximum = arr[i];
            int maximumIndex = i;
            for (int j = i + 1; j < arr.length; j++ ) {
                if(arr[j] > maximum) {
                    maximum = arr[j];
                    maximumIndex = j;
                }
            }
            arr[maximumIndex] = arr[i];
            arr[i] = maximum;
        }
        return arr;
    }
}
