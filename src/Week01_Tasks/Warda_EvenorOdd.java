package src.Week01_Tasks;

import java.util.Scanner;

public class Warda_EvenorOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        input.close();
        if(num%2==0){
            System.out.println(num+" This number is Even");}
        else{
            System.out.println(num+" This number is Odd");
        }
    }
}
/*1. Numbers -- odd & even
        Write a method which can identify given number is odd or even

        EX:
        identify(5)-> "Odd"
        identify(6)-> "Even"*/