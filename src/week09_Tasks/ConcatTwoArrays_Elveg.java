package week09_Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatTwoArrays_Elveg {

    public static void main(String[] args) {

        String[] stringArr1 = {"String1","String2"};
        String[] stringArr2 = {"String3","String4","String5"};

        System.out.println(Arrays.toString(concatTwoArrays(stringArr1, stringArr2)));

    }

    public static Object[] concatTwoArrays(Object[] arr1, Object[] arr2) {

        Object[] arr3 = Arrays.copyOf(arr1, arr1.length+arr2.length);
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i]=arr2[i-arr1.length];
        }

        /*Object[] arr3 = new Object[arr1.length + arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if (i >= arr1.length) {
                arr3[i] = arr2[i - arr1.length];
                continue;
            }
            arr3[i] = arr1[i];
        }*/

        return arr3;

    }

}
