package week07_Tasks;

import java.util.Arrays;

/*
Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
 arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */
public class SortDescending_Zulpikar {

    public static void main(String[] args) {

        int[] arr = {10, 20, 7, 8, 90, 12, 15, 64, 51, 1, 2, 6};
        System.out.println(Arrays.toString(sortDesc(arr)));

    }

    public static int[] sortDesc(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
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
