package src.Week02_Tasks;

public class PrintConsecutiveNumbers_Alina {
    public static void main(String[] args) {
        int N = 30;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            }else if(i % 2 == 0 && i % 3 == 0){
                System.out.println("CodilityTest");
            }else if(i % 3 == 0 && i % 5 == 0){
                System.out.println("TestCoders");
            }else if(i % 2 == 0 && i % 5 == 0){
                System.out.println("CodilityCoders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }


        }
    }
}
/*
Write a function that:
Given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible
by 2, 3, or 5 should be replaced by the words Codility, Test, or Coders, respectively. If a number is divisible by more than one
of the numbers: 2, 3, or 5, then it should be replaced by a concatenation of the respective words Codility, Test, and Coders in the given order.
For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest, and numbers divisible by all three numbers 2, 3, and 5, should be
replaced by CodilityTestCoders.
 */