package Week02_Tasks;

import java.util.ArrayList;

public class DivisibleBy_3_5_15_Zulpikar {

    //  Numbers -- Divisible by 3, 5, 15
    //  Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, 15.
    //  If the number can be divisible by 3, 5, and 15, then it should only be displayed in the DivisibleBy15 section.
    //  If the number can be divisible by 3 but can't be divisible by 15, then it should only be displayed in the DivisibleBy3 section.
    //  If the number can be divisible by 5 but can't be divisible by 15, then it should only be displayed in the DivisibleBy5 section.

    public static void main(String[] args) {

        printDivisibleBy3_5_15();


    }

    public static void printDivisibleBy3_5_15() {

        ArrayList<Integer> DivisibleBy15 = new ArrayList<>();
        ArrayList<Integer> DivisibleBy3 = new ArrayList<>();
        ArrayList<Integer> DivisibleBy5 = new ArrayList<>();


        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                DivisibleBy15.add(i);
            } else if (i % 3 == 0 && i % 15 != 0) {
                DivisibleBy3.add(i);
            } else if (i % 5 == 0 && i % 15 != 0) {
                DivisibleBy5.add(i);
            }
        }

        // print the numbers in each section
        System.out.println("Numbers divisible by 3, 5, and 15: " + DivisibleBy15);
        System.out.println("Numbers divisible by 5: " + DivisibleBy5);
        System.out.println("Numbers divisible by 3: " + DivisibleBy3);
    }



}
