package week08_Tasks;

import java.util.Arrays;


/*
* Q2.
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
* */

public class MoveZerosToTheEnd_Zulpikar {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        System.out.println(Arrays.toString(moveZerosToEnd(arr)));
        System.out.println(Arrays.toString(moveZerosToEnd2(arr)));

    }

    public static int[] moveZerosToEnd(int arr[]) {
        int n = arr.length;
        int j = 0;
        int[] arr2 = new int[n];

        // If the number is non-zero, then replace the number at the next position 'j'
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr2[j] = arr[i];
                j++;
            }
        }
        return arr2;
    }

    public static int[] moveZerosToEnd2(int[] arr) {
        int n = arr.length;
        int count = 0;  // Count of non-zero elements

        // If the number is non-zero, then replace the number at the next position 'count'
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Now all non-zero elements have been shifted to the front and 'count' is the count of all non-zero elements
        // Make all elements 0 from the count to end
        while (count < n) {
            arr[count++] = 0;
        }
        return arr;
    }


}
