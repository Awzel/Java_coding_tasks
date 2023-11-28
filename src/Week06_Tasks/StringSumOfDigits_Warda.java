package Week06_Tasks;

import java.util.Arrays;

public class StringSumOfDigits_Warda {
    //Write a method that can return the sum of the digits in a string
    public static int sumOfString(String str){
        char[] arrayStr = str.toCharArray();

        System.out.println(Arrays.toString(arrayStr));

        int sum = 0;

        for (char each : arrayStr) {
            if(Character.isDigit(each)){
                sum= sum+Character.getNumericValue(each);}
            else {continue;}

        }
        return sum;

    }

    public static void main(String[] args) {


        String str = "A123G456";

        System.out.println("SumOFArray(str) = " + sumOfString(str));


    }
}
