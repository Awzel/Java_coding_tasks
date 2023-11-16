package week06_Tasks;

/*
        Array -- Find Maximum
        Write a method that can find the maximum number from an int Array
*/


import java.util.Arrays;

public class FindMaximum_Zulpikar {

    public static void main(String[] args) {

        findMax1(new int[]{1, -90, 345, 2, -3, 6, 9, 90, 345});
        findMax2(new int[]{1, 345, 2, 3, 6, 9, 90, 213, -665, 123, 345});

        System.out.println("-----------------------------------------------");

        findMax1(new int[]{});
//        findMax2(new int[]{});

    }

    public static void findMax1(int[] arr) {

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        int max = arr[0]; // assume the first one is the maximum
        for (int i = 0; i < arr.length; i++) { // if the current one is larger than the maximum, update the maximum
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void findMax2(int[] arr) {

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        System.out.println(max);
    }


}
