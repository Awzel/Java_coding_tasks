package week09_Tasks;


import java.util.Arrays;

/*
* 1) Array - Concat two arrays
Write a return method that can concat two arrays
* */
public class ConcatTwoArrays_Zulpikar {


    public static void main(String[] args) {
        int [] arr1 = {1, 3, 5, 9};
        int [] arr2 = {8, 13, 5, 7};

        int[] concatenatedArray = concatenate(arr1, arr2);
        System.out.println(Arrays.toString(concatenatedArray));

    }
        public static int[] concatenate(int[] a, int[] b) {
            int aLen = a.length;
            int bLen = b.length;

            int[] result = new int[aLen + bLen];

            for (int i = 0; i < aLen; i++) {
                result[i] = a[i];
            }

            for (int i = 0; i < bLen; i++) {
                result[i + aLen] = b[i];
            }

            return result;
        }
}



