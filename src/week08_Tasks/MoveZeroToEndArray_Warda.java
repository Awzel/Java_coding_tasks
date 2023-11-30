package week08_Tasks;

import java.util.Arrays;

public class MoveZeroToEndArray_Warda {
    public static void main(String[] args) {
        int[] arr = {0,2,0,9,0,7,8};
        System.out.println("movetozeo(arr) = " + Arrays.toString(movetozero(arr)));


    }

    public static int[] movetozero(int[] arr){

        int[] arr2= new int[arr.length];
        int indexnumber = 0;
        for (int eachElement : arr) {
            if(eachElement !=0){
                arr2[indexnumber++]= eachElement;
            }

        }
        return arr2;


    }

    /*
    I will assume I have an int array
    to perform the task i will need
    1 empty array variable
    1 int variable representing the index number
    for loop
    within the forloop ,
    - I will take each element of the hardcoded array
    - verify if element is not 0
    - if true then  newarray [] indexnumber is equal to the element
    - this will keep on adding the number that are not zero
    - if number is zero it will not add it, and continue the loop till the end of the array length

     */



}
