package week07_Tasks;


import java.util.Arrays;

/*
Question1: Array - Find Minimum
Write a method that can find the minimum number from an int Array
* */
public class FindMinimum_Zulpikar {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("The minimum number is: " + findMinimum(arr));
        System.out.println("The minimum number is: " + findMinimum(arr2));

        System.out.println("----------------------------------------------");

        System.out.println("The minimum number is: " + findMinimum2(arr));
        System.out.println("The minimum number is: " + findMinimum2(arr2));

    }

    public static int findMinimum(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int findMinimum2(int[] arr) {

        Arrays.sort(arr);
        return arr[0];

    }

}
