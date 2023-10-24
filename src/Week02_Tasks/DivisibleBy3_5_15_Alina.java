package Week02_Tasks;

public class DivisibleBy3_5_15_Alina {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                System.out.println(i + " Divisible by 15");
            } else if (i % 3 == 0) {
                System.out.println(i + " Divisible by 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " Divisible by 5");
            } else {
                System.out.println(i);
            }
        }
    }
}
/*
 Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, 15.
  If the number can be divisible by 3, 5, and 15, then it should only be displayed in the DivisibleBy15 section.
  If the number can be divisible by 3 but can't be divisible by 15, then it should only be displayed in the DivisibleBy3 section.
  If the number can be divisible by 5 but can't be divisible by 15, then it should only be displayed in the DivisibleBy5 section.

 */