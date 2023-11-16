package Week02_Tasks;

public class Divisible_by_3_5_15_Sabina {
    /*
    this code calculates and separates numbers between 1 and 100 into three categories: divisible by 15, divisible by 5 but not 3, and divisible by 3 but not 5, and then it prints the numbers in each category.
     */

    public static void main(String[] args) {
        // 1. Initializing 3 empty String, where will be stored numbers divisible by 15, 5, 3
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        // Looping though numbers from 1 to 100, where variable "i" represents the current number being checked
        for (int i = 1; i <= 100 ; i++) {
            // if "i" is divisible by 15("i" % 15 == 0), it includes the number "i" followed by a space to the
            // divisibleBy15 String. The logic of if and else if built the way once it will find the correct answer
            // it will move on to the next iteration since there is no other code in our loop
            if (i % 15 == 0){
                divisibleBy15 += i + " ";
            }else if (i % 3 == 0){
                divisibleBy3 += i + " ";
            }else if(i % 5 == 0){
                divisibleBy5 += i + " ";
            }
        }

        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);
    }
}
