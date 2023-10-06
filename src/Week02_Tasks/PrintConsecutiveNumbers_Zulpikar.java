package Week02_Tasks;

public class PrintConsecutiveNumbers_Zulpikar {

    // Numbers -- print consecutive numbers
    /*
    Write a function that:
    Given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible
    by 2, 3, or 5 should be replaced by the words Codility, Test, or Coders, respectively. If a number is divisible by more than one
    of the numbers: 2, 3, or 5, then it should be replaced by a concatenation of the respective words Codility, Test, and Coders in the given order.
    For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest, and numbers divisible by all three numbers 2, 3, and 5, should be
    replaced by CodilityTestCoders.
    */

    public static void main(String[] args) {

        printConsecutiveNumbers(24);

    }

    public static void printConsecutiveNumbers(int N) {
        for (int i = 1; i <= N; i++) {

            boolean divisibleBy2 = i % 2 == 0;
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;


            // the order of the conditions is important because Once a condition is found to be true, the corresponding
            // block of code is executed, and the remaining conditions are not evaluated.

            if (divisibleBy2 && divisibleBy3 && divisibleBy5) { // has to be executed first
                System.out.println("CodilityTestCoders");
            } else if (divisibleBy2 && divisibleBy5) {
                System.out.println("CodilityCoders");
            } else if (divisibleBy3 && divisibleBy5) {
                System.out.println("TestCoders");
            } else if (divisibleBy2 && divisibleBy3) {
                System.out.println("CodilityTest");
            } else if (divisibleBy5) {
                System.out.println("Coders");
            } else if (divisibleBy3) {
                System.out.println("Test");
            } else if (divisibleBy2) {
                System.out.println("Codility");
            } else {
                System.out.println(i);
            }
        }
    }




}
