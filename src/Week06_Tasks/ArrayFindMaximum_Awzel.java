package Week06_Tasks;

public class ArrayFindMaximum_Awzel {

    public static int findMax(int[] arr){

        if (arr.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] numbers = {5,4,32,11,43,99,88};

        System.out.println("Maximum number is: " + findMax(numbers));

        int[] differentNumbers = {51,423,342,1121,433,929,8888};

        System.out.println("Maximum number is: " + findMax(differentNumbers));

//        int [] emptyArray = {};
//        System.out.println(findMax(emptyArray));


    }





}
/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */