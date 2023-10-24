package week2;

public class PrintConsecutiveNumbers_Sabina {

    /*
    Write a function
that given a positive integer N, prints the consecutive numbers from 1 to N, each on separate line.
However, any number divisible by 2,3,5 should be replaced by the word Codility, Test, Coders respectively.
If the number is divisible by more than one of the numbers: 2,3 or 5 it should be replaced by the concatenation of respective words Codility, Test, Coders in this given order.
For example numbers divisible by both 2,3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3,5 should be replaced by CodilityTestCoders.
     */

    public static void main(String[] args) {

        //printConsecutiveNumbers(24);

        int n = 61; // Replace with your desired value of N
        printConsecutiveNumbers(n);



    }

    public static void printConsecutiveNumbers(int n) {

        for (int i = 1; i < n; i++) {
            String result = ""; // we need the String result to start from the beginning in order to replace the
            // number with more than one word. EX: 15 is divisible by 3 and 5 so the result should contain both Test
            // and Coder in one line

            if (i % 2 == 0) {
                result += "Codility";
            }
            if (i % 3 == 0) {
                result += "Test";
            }
            if (i % 5 == 0) {
                result += "Coder";
            }

            if (result.isEmpty()) { // in case number "i" wasn't divisible by any number then it should print out as
                // is it
                System.out.println(i);
            } else {
                System.out.println(result);
            }

        }
    }


























   /*     public static void printReplacedNumbers3(int n){
            for (int i = 1; i <= n; i++) {
                String output = "";

                if (i % 2 == 0) {
                    output += "Codility";
                }
                if (i % 3 == 0) {
                    output += "Test";
                }
                if (i % 5 == 0) {
                    output += "Coders";
                }

                if (output.isEmpty()) {
                    System.out.println(i);
                } else {
                    System.out.println(output);
                }

            }
        }

    */

   /* public static void printReplacedNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuilder output = new StringBuilder();

            if (i % 2 == 0) {
                output.append("Codility");
            }
            if (i % 3 == 0) {
                output.append("Test");
            }
            if (i % 5 == 0) {
                output.append("Coders");
            }

            // If none of the conditions matched, use the number itself
            if (output.length() == 0) {
                output.append(i);
            }

            System.out.println(output);
        }
    }

    */


}

