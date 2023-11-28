package week09_Tasks;

import java.util.Arrays;

public class ConcatArrays_Warda {
    public static void main(String[] args) {
        int[] arr1 =  {5,2,9,8};
        int[] arr2 = {6,2,0,7};
        System.out.println(Arrays.toString(concatArray(arr1,arr2)));

    }


    public static int[] concatArray(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length+arr2.length];

        for (int i = 0, y=0; i <arr.length ; i++) {
            if(i<arr1.length){arr[i]=arr1[i];}
            else{arr[i]=arr2[y++];}

        }



        return arr;
    }




}
/*

Assuming I am working with integers array 1 and Integers array2
I will need a new integer array and the paramenter for the length would be
array1.length + array2. length, so total length of both the arrays.
Then I will create a fori loop
I will need to starting points, since i have two arrays, so i+y
I will also need the length to be of newarray length
itieration will be i++ , because we are following the length of new array

in the loop :
if I is less than the length of array 1,
we can add the elements of array 1at index i into new array index i
otherwise, new array index i is equal to array2 index y

return would be array int








 */