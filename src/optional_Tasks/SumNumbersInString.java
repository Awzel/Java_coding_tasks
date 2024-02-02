package optional_Tasks;

public class SumNumbersInString {

    /*
    * Create a program in Java that will take any String and print the total sum of all the numbers in the String.
    * Note: Numbers can be more than digits from 1-9, so if you have “14” next to each other, it should be considered 14 and not 1 and 4 separate.
    * */

    public static void main(String[] args) {

    }

    public static int sumNumbersInString(String input) {
        int sum = 0;
        String[] numbers = input.split("\\D+");
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }


}
