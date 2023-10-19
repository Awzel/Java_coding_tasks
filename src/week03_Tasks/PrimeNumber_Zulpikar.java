package week03_Tasks;

/*

1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not

A prime number is a natural number greater than 1 that is not a product of two smaller natural numbers.

 */

public class PrimeNumber_Zulpikar {

    public static void main(String[] args) {
        int number1 = -11;
        System.out.println(isPrimeNumber(number1));

        int number2 = 11;
        System.out.println(isPrimeNumber(number2));

        int number3 = 72;
        System.out.println(isPrimeNumber(number3));

        int number4 = 7919;
        System.out.println(isPrimeNumber(number4));

    }

    public static boolean isPrimeNumber(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;



    }
}
