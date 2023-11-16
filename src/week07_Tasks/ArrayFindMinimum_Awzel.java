package week07_Tasks;

public class ArrayFindMinimum_Awzel {

    public static void findMin(int[] arr){

        if (arr.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }

        int min = arr[0];

        for (int each : arr) {
            if (each < min){
                min = each;
            }
        }

        System.out.println("Minimum number is: " + min);

    }

    public static void main(String[] args) {

        int[] array = {1,2,3,6,4,8,5,88};
        int[] array2 = {10,52,3,65,46,86,5,-68};

        findMin(array);
        findMin(array2);

    }

}
/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */