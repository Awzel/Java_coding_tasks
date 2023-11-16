package week07_Tasks;

import java.util.Arrays;

/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
* */
public class SortAscending_Zulpikar {


    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 3, 4, 8, 6, 2, 1};
        System.out.println(Arrays.toString(sortAsc(arr)));
    }

    public static int[] sortAsc(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
