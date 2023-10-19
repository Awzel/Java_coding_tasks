package week01_Tasks.Solutions;

import java.util.Scanner;

public class W1_NumberOddOrEven {

    //QUESTION 1 - Write a method which can identify if a given number odd or even

    public static String identify(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd";

    }

    public static void main(String[] args) {

        System.out.println(identify(5));

        //identify1();

        //identify2();

        //System.out.println(identify3(8));
    }


//-------------------------------------------------------------------------------------------
//Additional Answers
public static void identify1(){

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
        System.out.println(num + " is even");
        else
        System.out.println(num + " is odd");
        }

//----------------------------------------------------------------------------------------

public static void identify2(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);
        }

//-------------------------------------------------------------------------


public  static  String  identify3( int  n ) {
        return  n % 2==0 ? "Even" : "odd" ;
        }

        }
