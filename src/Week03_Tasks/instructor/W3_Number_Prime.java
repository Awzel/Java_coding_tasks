package src.Week03_Tasks.instructor;

public class W3_Number_Prime {
       /*
        Write a method that can check if a number is prime or not
     */

    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }

        }

        return true;

    }

// Test 2
    public static void main(String[] args) {
        System.out.println("primeNumber() = " + isPrimeNumber(7));
        System.out.println("primeNumber() = " + isPrimeNumber(11));
        System.out.println("primeNumber() = " + isPrimeNumber(9));
        System.out.println("primeNumber() = " + isPrimeNumber(18920));


    }

}
